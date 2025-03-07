package Comands;

import CollectionManager.CollectionManager;
import Models.Movie;
import Transfer.Request;
import Transfer.Response;

import java.text.CollationElementIterator;
import java.util.List;

public class Show extends Command{

    public Show(){
        super("show", "Выводит элемент по id");
    }

    @Override
    public Response execute(Request req){
        return new Response("Вот", List.copyOf(CollectionManager.getInstance().getCollection()));

    }
}
