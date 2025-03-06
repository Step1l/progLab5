package CollectionManager;
import Models.Movie;

import java.util.Collections;
import java.util.TreeSet;
public class CollectionManager {
    private static CollectionManager instance;
     private TreeSet<Movie> collection = new TreeSet<Movie>();;
    private CollectionManager(){
    }

    public static CollectionManager getInstance(){
        return instance == null ? instance=new CollectionManager(): instance;
    }


    public TreeSet<Movie> getCollection(){
        return collection;
    }

}
