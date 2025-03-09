package IO.Parser;

import java.util.TreeSet;

public class Wrapper<T> {
    public TreeSet<T> getSet() {
        return set;
    }

    private TreeSet<T> set = new TreeSet<>();

    public Wrapper(){}

    public Wrapper(TreeSet<T> set){
        this.set = set;
    }


}
