package example;

import java.io.IOException;

public class PlayMovie {
    private Movie movie;

    PlayMovie(Movie movie){
        this.movie = movie;
    }

    public void Player() throws IOException {
        System.out.println(movie.getMovie() + " is being played");
    }
}