package model.Movies;

import java.util.ArrayList;

public class Movie 
{
    private String thumbnailName;
    private String title;
    private String sypnosis;
    private String mtcrbRating;
    private String genre;
    
    public Movie(ArrayList<String> infos)
    {
        this.thumbnailName = infos.get(0);
        this.title = infos.get(1);
        this.sypnosis = infos.get(2);
        this.mtcrbRating = infos.get(3);
        this.genre = infos.get(4);
    }

    
    public String getMtcrbRating()
    {
        return mtcrbRating;
    }

    public String getGenre()
    {
        return genre;
    }

    public String getSypnosis()
    {
        return sypnosis;
    }

    public String getThumbnailName()
    {
        return thumbnailName;
    }

    public String getTitle()
    {
        return title;
    }
   
    
    
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