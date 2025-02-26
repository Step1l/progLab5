package Transfer;

import Models.Movie;

import java.util.List;

public record Response(String message, List<Movie> movies) {
    public Response(String message){
        this(message,null);
    }
}
