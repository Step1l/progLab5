package Comands;

import CollectionManager.CollectionManager;
import Transfer.Request;
import Transfer.Response;

public class Add extends Command{
    public Add(){
        super("add","Добавляет фильм в коллекцию");
    }


    @Override
    public Response execute(Request req){
        CollectionManager.getInstance().getCollection().add(req.movies().get(0));
        return new Response("Добавленно");

    }
}