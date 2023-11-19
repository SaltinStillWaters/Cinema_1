package control;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import model.Movies.Movie;
import model.Movies.Movies;
import model.theater_seats.TheaterSeat;
import model.theater_seats.TheaterSeats;
import view.MovieInfoFrame.MovieInfoFrame;
import view.PaymentDetails.PaymentDetails;
import view.Receipt.Receipt;
import view.SeatFrame.SeatFrame;
import view_components.ULabel;
import view_components.UMovieLabel;
import view_components.USeat;
import view_components.interfaces.ChangeState;
import view_components.interfaces.SwitchFrame;

public class ClickedListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        ControlData ctrlData = ControlData.getInstance();

        Object source = e.getSource();

        if (source instanceof UMovieLabel) {
            ControlSeats ctrlSeats = ControlSeats.getInstance();

            UMovieLabel movieLabel = (UMovieLabel) source;
            String movieTitle = movieLabel.getMovieTitle();
            Movie movie = Movies.getInstance().getMovie(movieTitle);
            ctrlData.setCurrMovie(movie);
            ControlFrame.changeFrame("MovieInfoFrame");
            MovieInfoFrame frame = (MovieInfoFrame) ctrlData.getFrameByName("MovieInfoFrame");
            frame.changeMovie(movie);

            TheaterSeat tSeat = ctrlSeats.getCurrTheaterSeat();
            tSeat.setMovieTitle(movieLabel.getMovieTitle());
        } else if (source instanceof SwitchFrame) {
            SwitchFrame component = (SwitchFrame) source;
            boolean isSwitch = true;

            // Determine destFrame
            String destFrame = "";
            if (component.getComponentType().equals("next")) {
                destFrame = ctrlData.getNextFrame();
            } else if (component.getComponentType().equals("back")) {
                if (!ctrlData.getPrevFrame().isBlank()) {
                    destFrame = ctrlData.getPrevFrame();
                }
            } else {
                destFrame = component.getDestFrame();

                if (source instanceof ULabel) {
                    ULabel sourceLabel = (ULabel) source;
                    if (sourceLabel.getDestFrame().equals("SeatFrame")) {
                        // Point to proper currTSeat
                        ControlSeats ctrlSeats = ControlSeats.getInstance();
                        String movieTitle = ctrlData.getCurrMovie().getTitle();
                        MovieInfoFrame movieInfoFrame = (MovieInfoFrame) ctrlData.getFrameByName("MovieInfoFrame");
                        String date = movieInfoFrame.getDate();
                        String time = movieInfoFrame.getTime();

                        TheaterSeat theaterSeat = TheaterSeats.getInstance().getTheaterSeat(movieTitle, date, time);
                        if (theaterSeat != null) {
                            ctrlSeats.setCurrTheaterSeat(theaterSeat);

                            // Initialize components of Frame
                            SeatFrame currFrame = (SeatFrame) ctrlData.getFrameByName("SeatFrame");
                            currFrame.constructSeats();
                            currFrame.updateTextField();

                            isSwitch = true;
                        } else {
                            isSwitch = false;
                        }
                    } else if (sourceLabel.getDestFrame().equals("PaymentDetails")) {
                        PaymentDetails currFrame = (PaymentDetails) ctrlData.getFrameByName("PaymentDetails");
                        currFrame.updateFrame();
                    } else if (sourceLabel.getDestFrame().equals("Receipt"))
                    {
                        Receipt currFrame = (Receipt) ctrlData.getFrameByName("Receipt");
                        currFrame.updateFrame();
                    }
                }
            }
            if (!destFrame.isBlank() && isSwitch) {
                ControlFrame.changeFrame(destFrame);
            }
        } else if (source instanceof ChangeState) {
            ChangeState component = (ChangeState) source;

            if (source instanceof USeat) {
                USeat uSeat = (USeat) source;

                if (component.getState().equals("available")) {
                    component.setState("selected");

                    uSeat.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_selected.png"));
                    uSeat.scale();

                    SeatFrame currFrame = (SeatFrame) ctrlData.getFrameByName(ctrlData.getCurrFrame());
                    currFrame.updateTextField();
                } else if (component.getState().equals("selected")) {
                    component.setState("available");

                    uSeat.setIcon(new ImageIcon("src/main/resources/SeatFrame/seat_available.png"));
                    uSeat.scale();

                    SeatFrame currFrame = (SeatFrame) ctrlData.getFrameByName(ctrlData.getCurrFrame());
                    currFrame.updateTextField();
                }
            }
        } else {
            System.out.println("Mouse clicked is not a Clickable");
        }
    }
}