package Comands;

import CollectionManager.CollectionManager;
import Transfer.Request;
import Transfer.Response;

public class Clear extends Command{
    public Clear(){
        super("clear","очистить коллекцию");
    }

    public Response execute(Request req){
        CollectionManager.getInstance().getCollection().clear();
        return new Response("Коллекция очищенна");
    }
}
