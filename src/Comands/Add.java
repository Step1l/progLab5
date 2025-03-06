package Comands;

import CollectionManager.CollectionManager;
import Transfer.Request;
import Transfer.Response;

public class Add extends Command{
    public Add(){

        super("add","Добавляет фильм в коллекцию",true);
    }


    @Override
    public Response execute(Request req){
        CollectionManager.getInstance().getCollection().add(req.movie());
        return new Response("Добавленно");

    }
}