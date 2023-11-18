package model.Movies;

import java.util.ArrayList;


public class Movies 
{
    private ArrayList<Movie> movies;
    
    public Movies(ArrayList<Movie> movies)
    {
        this.movies = movies;
    }
    
    /**
     * Retrieves a Movie object with the specified title from the movies list.
     * <p>
     * This method searches through the list of movies to find the matching title
     * provided in the parameter. If movie is found, it returns the Movie object, 
     * if false it returns a null.
     * 
     * @param title the title of the movie to be retrieved.
     * @return the Movie object with the specified title, or null if not found.
     */
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