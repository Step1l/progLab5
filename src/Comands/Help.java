package Comands;

import Transfer.Request;
import Transfer.Response;

public class Help extends Command  {
    public Help(){
        super("help","справка о командах");
    }



    public Response execute(Request req){
        return new Response(CommandMap.getInstance().toString());
    }
}
