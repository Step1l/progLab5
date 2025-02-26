package Comands;

import Transfer.Request;
import Transfer.Response;

abstract class Command {
    private String name;
    private String description;

    public Command(String name,String description){
        this.name=name;
        this.description =description;
    }

    public String getDescriprion(){

        return description;
    }
    public String getName(){

        return name;
    }

    abstract public Response execute(Request req);
}
