package Builders;

import IO.Console;
import Models.Coordinates;
import Models.Movie;
import Models.MovieGenre;
import Models.Person;

import java.time.LocalDateTime;

public class MovieBuilder {
    private static MovieBuilder instance;

    private MovieBuilder(){};

    public static MovieBuilder  getInstance(){
        return instance==null? instance = new MovieBuilder() : instance;
    }

    public Movie build(Console console){
        Long id = Long.getLong(console.ask("id:"));// Добавить авто генерацию
        String name = console.ask("name:");
        Coordinates coordinates = CoordinatesBuilder.getInstance().build(console);
        LocalDateTime creationDate = LocalDateTime.of(2024,2,24,0,0);//Добавить авто генерацию
        int oscarCount = Integer.getInteger(console.ask("oscar:"));
        String tagline = console.ask("tagline:");
        Long length = Long.getLong(console.ask("length:"));
        MovieGenre genre = MovieGenreBuilder.getInstance().build(console);
        Person operator = PersonBuilder.getInstance().build(console);
        return new Movie(id,name,coordinates,creationDate,oscarCount,tagline,length,genre,operator);
    }
}
