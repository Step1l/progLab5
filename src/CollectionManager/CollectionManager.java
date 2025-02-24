package CollectionManager;
import Models.Movie;

import java.util.TreeSet;
import java.util.HashMap;
public class CollectionManager {
    TreeSet<Movie> col;
    HashMap<Long, Movie> idCol = new HashMap<>();
    public CollectionManager(TreeSet<Movie> col){
        this.col=col;
    }

    public TreeSet<Movie> getCol(){
        return col;
    }

    public void add(Movie a){
        idCol.put(a.getId(),a);
        col.add(a);

    }


    public void remove(long id){
        col.remove(idCol.get(id));
    }


}
