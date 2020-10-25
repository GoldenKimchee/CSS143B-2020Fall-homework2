package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        this.id = anotherMovie.id;
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
    }

    @Override
    public boolean equals(Object obj) {
        Movie otherMovie = (Movie) obj;
        if (otherMovie.id == this.id) {
            return true;
        }
        return false;
    }
}
