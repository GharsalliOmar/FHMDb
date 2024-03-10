import java.util.List;
import java.util.ArrayList;


public class Movies {
    String title;
    String description;
    List<Genre> genres;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    enum Genre {
        ACTION, ADVENTURE, ANIMATION, BIOGRAPHY, COMEDY, CRIME, DRAMA,
        DOCUMENTARY, FAMILY, FANTASY, HISTORY, HORROR, MUSICAL, MYSTERY,
        ROMANCE, SCIENCE_FICTION, SPORT, THRILLER, WAR, WESTERN
    }
    public static List<Movies> initializeMovies() {
        List<Movies> movieList = new ArrayList<>();

        // Dummy-Movie 1
        Movies movie1 = new Movies();
        movie1.setTitle("Movie 1");
        movie1.setDescription("Description for Movie 1");
        movie1.setGenres(List.of(Genre.ACTION, Genre.ADVENTURE));
        movieList.add(movie1);

        // Dummy-Movie 2
        Movies movie2 = new Movies();
        movie2.setTitle("Movie 2");
        movie2.setDescription("Description for Movie 2");
        movie2.setGenres(List.of(Genre.COMEDY, Genre.ROMANCE));
        movieList.add(movie2);


        return movieList;
    }
}
