package Transfer;

import Models.Movie;

import java.util.List;

public record Response(String message, List<Movie> movies, String script) {
    public Response(String message){

        this(message,null, null);
    }
    public Response(String message,List<Movie> movies){
        this(message, movies, null);
    }
    public Response(String message,String script){
        this(message,null,script);
    }
    @Override
    public String toString(){
        String mov = "";
        if (movies == null) return message;
        for (Movie i : movies ){
            mov = mov + i +"============"+"\n";
        }
        return message +"\n"+mov;
    }
}
