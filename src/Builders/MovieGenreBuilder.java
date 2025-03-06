package Builders;

import IO.Console;
import Models.Movie;
import Models.MovieGenre;

import java.util.Map;

public class MovieGenreBuilder {
    private static MovieGenreBuilder instance;

    Map<Integer,MovieGenre> map = Map.of(1,MovieGenre.WESTERN,2,MovieGenre.ADVENTURE,3,MovieGenre.TRAGEDY,4,MovieGenre.THRILLER,5,MovieGenre.SCIENCE_FICTION);

    private MovieGenreBuilder(){}
    public static MovieGenreBuilder getInstance(){
        return instance == null ? instance = new MovieGenreBuilder():instance;
    }

    public MovieGenre build(Console console){
        for (int i=1;i<6;i++){
            console.printMessage(i+":"+map.get(i));
        }
        int ind = Integer.parseInt(console.ask("genre:"));
        return map.get(ind);
    }
}
