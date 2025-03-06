package Builders;

import IO.Console;
import Models.Coordinates;

public class CoordinatesBuilder {
    private static CoordinatesBuilder instance;

    private CoordinatesBuilder(){

    }

    public static CoordinatesBuilder getInstance(){
        return instance == null? instance=new CoordinatesBuilder() : instance;
    }

    public Coordinates build(Console console){
        int x = Integer.getInteger(console.ask("x:"));
        Long y = Long.getLong(console.ask("y:"));
        return new Coordinates(x,y);
    }
}
