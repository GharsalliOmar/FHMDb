package at.ac.fhcampuswien.fhmdb.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

public class MovieTest {

    @Test
    public void movieHasGenre_WhenGenreIsPresent() {
        // Arrange
        Movie movie = new Movie("Test Movie", "This is a test movie.",
                List.of(Movie.Genre.ACTION, Movie.Genre.COMEDY));

        // Act
        boolean hasActionGenre = movie.getGenres().contains(Movie.Genre.ACTION);
        boolean hasHorrorGenre = movie.getGenres().contains(Movie.Genre.HORROR);

        // Assert
        assertTrue(hasActionGenre, "The movie should have the ACTION genre.");
        assertFalse(hasHorrorGenre, "The movie should not have the HORROR genre.");
    }
}