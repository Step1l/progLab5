package Comands;

import Transfer.Request;
import Transfer.Response;

abstract public class Command {
    private String name;
    private String description;

    private Boolean argIsMovie;

    public Command(String name,String description,Boolean argIsMovie){
        this.name=name;
        this.description =description;
        this.argIsMovie = argIsMovie;
    }
    public Command(String name, String description){
        this.name=name;
        this.description=description;
        this.argIsMovie = false;
    }

    public String getDescription(){

        return description;
    }
    public String getName(){

        return name;
    }
    public Boolean getArgIsMovie() {
        return argIsMovie;
    }



    abstract public Response execute(Request req);
}
