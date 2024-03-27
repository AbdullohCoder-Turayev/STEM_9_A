package example;

public class PlayMovie {
    private Movie movie;

    PlayMovie(Movie movie){
        this.movie = movie;
    }

    public void Player(){
        System.out.println(movie.getMovie() + " is being played");
    }
}
