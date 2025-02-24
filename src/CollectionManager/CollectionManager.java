package CollectionManager;
import Models.Movie;

import java.util.TreeSet;
import java.util.HashMap;
public class CollectionManager {
    TreeSet<Movie> col;
    HashMap<Long, Movie> idCol = new HashMap<>();
    public CollectionManager(TreeSet<Movie> col){
        for (Movie a : col){
            if (!idCol.containsValue(a) && !idCol.containsKey(a.getId())){
                idCol.put(a.getId(),a);
            }
            else{
                //выбрасываем исключение
            }
        }
        this.col=col;
    }

    public TreeSet<Movie> getColection(){

        return col;
    }

    public void add(Movie a){
        if (col.contains(a)){
            //Выбросить исключение или т.п.

        }
        idCol.put(a.getId(),a);
        col.add(a);

    }


    public void remove(long id){
        col.remove(idCol.get(id));
    }


}
