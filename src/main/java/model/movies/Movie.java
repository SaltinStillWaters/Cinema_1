package model.Movies;

import java.util.ArrayList;

public class Movie 
{
    private String thumbnailName;
    private String title;
    private String sypnosis;
    private String mtcrbRating;
    private String genre;
    
    /**
     * Constructs a Movie object using information provided in the form of an ArrayList.
     *
     * @param infos an ArrayList containing all the information about the movie. 
     */
    public Movie(ArrayList<String> infos)
    {
        this.thumbnailName = infos.get(0);
        this.title = infos.get(1);
        this.sypnosis = infos.get(2);
        this.mtcrbRating = infos.get(3);
        this.genre = infos.get(4);
    }
    
    /**
     * Returns the MTRCB Rating of the object.
     * 
     * @return a String representing the MtrcbRating of the object
     */
    public String getMtcrbRating()
    {
        return mtcrbRating;
    }

    /**
     * Returns the Genre of the object.
     *               
     * @return a String representing the Genre of the object.
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Returns the Synopsis of the object.
     * 
     * @return a String representing the Synopsis of the object.
     */
    public String getSypnosis()
    {
        return sypnosis;
    }

    /**
     * Returns the  of the object.
     * 
     * @return a String representing the Genre of the object.
     */
    public String getThumbnailName()
    {
        return thumbnailName;
    }

    /**
     * Returns the Genre of the object.
     * 
     * @return a String representing the Genre of the object.
     */
    public String getTitle()
    {
        return title;
    }
   
    /**
     * Returns a String representation of the object.
     * 
     * This method constructs and returns a formatted string containing details about the object,
     * including the Thumbnail name, Title, Synopsis, MTCRB rating, and Genre.
     * @return 
     */  
    @Override
    public String toString() 
    {
        return  "Thumbnail Name: " + thumbnailName + "\n" +
                "Title: " + title + "\n" +
                "Sypnosis: " + sypnosis + "\n" +
                "MTCRB rating: " + mtcrbRating + "\n" +
                "Genre: " + genre + "\n";
    }    
}