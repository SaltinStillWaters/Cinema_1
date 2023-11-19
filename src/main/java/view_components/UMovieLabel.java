package view_components;


public class UMovieLabel extends ULabel 
{
    private String movieTitle;
    
    public UMovieLabel()
    {
        super();
        movieTitle = "";
    }

    public void setMovieTitle(String movieTitle)
    {
        this.movieTitle = movieTitle;
    }

    
    public String getMovieTitle()
    {
        return movieTitle;
    }
    
    
}