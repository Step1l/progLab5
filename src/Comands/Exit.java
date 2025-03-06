package Comands;

import Transfer.Request;
import Transfer.Response;

public class Exit extends Command{

    public Exit(){
        super("exit","Завершает программу");

    }



    @Override
    public Response execute(Request req){
        System.exit(0);
        return new Response("Exit...");
    }

}
