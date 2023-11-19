package model.Movies;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Movies 
{
    private ArrayList<Movie> movies;
    private static Movies instance;

    public Movies()
    {
        movies = new ArrayList<>();

        ArrayList<String> infoHolder = new ArrayList<>();

        Path filePath = Paths.get("src/main/java/model/Movies/moviesInfo.txt");
        try (Scanner scanner = new Scanner(filePath))
        {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if (line.isEmpty())
                {
                    this.movies.add(new Movie(infoHolder));
                    infoHolder.clear();
                    continue;
                }
                infoHolder.add(line);
            }
            if (!infoHolder.isEmpty())
            {
                this.movies.add(new Movie(infoHolder));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Movies getInstance()
    {
        if (instance == null)
        {
            instance = new Movies();
        }

        return instance;
    }

    public Movie getMovie(String title)
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