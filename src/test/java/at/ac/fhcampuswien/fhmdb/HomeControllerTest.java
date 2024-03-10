package at.ac.fhcampuswien.fhmdb;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Collectors;
import java.util.List;

class MovieTest {

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

    @Test
    public void movieTitleContainsQuery_WhenQueryMatches() {
        // Arrange
        Movie movie = new Movie("Sample Movie", "Description for Sample Movie",
                List.of(Movie.Genre.DRAMA, Movie.Genre.ROMANCE));

        // Act
        boolean titleContainsSample = movie.getTitle().toLowerCase().contains("sample");
        boolean titleContainsAction = movie.getTitle().toLowerCase().contains("action");

        // Assert
        assertTrue(titleContainsSample, "The movie title should contain 'Sample'.");
        assertFalse(titleContainsAction, "The movie title should not contain 'Action'.");
    }

    @Test
    public void filterMoviesByGenre_ReturnsFilteredMovies() {
        // Arrange
        List<Movie> allMovies = Movie.initializeMovies();
        String selectedGenre = "ACTION";

        // Act
        List<Movie> filteredMovies = allMovies.stream()
                .filter(movie -> movie.getGenres().contains(Movie.Genre.valueOf(selectedGenre)))
                .collect(Collectors.toList());

        // Assert
        assertFalse(filteredMovies.isEmpty(), "Filtered movies should not be empty.");
        assertTrue(filteredMovies.stream().allMatch(movie -> movie.getGenres().contains(Movie.Genre.ACTION)),
                "All filtered movies should have the ACTION genre.");
    }
}