package at.ac.fhcampuswien.fhmdb.models;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String description;
    List<Genre> genres;

    public Movie(String title, String description, List<Genre> action) {

    }

    enum Genre {
        ACTION, ADVENTURE, ANIMATION, BIOGRAPHY, COMEDY, CRIME, DRAMA,
        DOCUMENTARY, FAMILY, FANTASY, HISTORY, HORROR, MUSICAL, MYSTERY,
        ROMANCE, SCIENCE_FICTION, SPORT, THRILLER, WAR, WESTERN
    }
    // TODO add more properties here

    public Movie(String title, String description) {
        this.title = title;
        this.description = description;
        this.genres = genres;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    // Methode zur Initialisierung von Dummy-Movie-Daten
    public static List<Movie> initializeMovies() {
        List<Movie> movies = new ArrayList<>();

        // Dummy-Movie 1
        Movie movie1 = new Movie("Movie 1", "Description for Movie 1",
                List.of(Genre.ACTION, Genre.ADVENTURE));
        movies.add(movie1);

        // Dummy-Movie 2
        Movie movie2 = new Movie("Movie 2", "Description for Movie 2",
                List.of(Genre.COMEDY, Genre.ROMANCE));
        movies.add(movie2);

        // Füge weitere Dummy-Movies nach Bedarf hinzu

        return movies;
    }
}

