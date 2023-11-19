package model.Movies;

import java.util.ArrayList;

public class Movie 
{
    private String thumbnailName;
    private String title;
    private String sypnosis;
    private String mtcrbRating;
    private String genre;
    private String runTime;
    private String director;
    private String stars;
    
    
    public Movie(ArrayList<String> infos)
    {
        this.thumbnailName = infos.get(0);
        this.title = infos.get(1);
        this.sypnosis = infos.get(2);
        this.mtcrbRating = infos.get(3);
        this.genre = infos.get(4);
        this.runTime = infos.get(5);
        this.director = infos.get(6);
        this.stars = infos.get(7);
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

    public String getStars()
    {
        return stars;
    }

    public String getRunTime()
    {
        return runTime;
    }

    public String getDirector()
    {
        return director;
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