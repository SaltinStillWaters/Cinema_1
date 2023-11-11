package model;

import java.util.ArrayList;


public class Movies 
{
    private ArrayList<Movie> movies;
    
    public Movies(ArrayList<Movie> movies)
    {
        this.movies = movies;
    }
    
    Movie getMovie(String title)
    {
        Movie foundMovie = null;
        
        for (Movie movie : movies)
        {
            if (movie.getTitle().equals(title))
            {
                foundMovie = movie;
                break;
            }
        }
        
        return foundMovie;
    }
}