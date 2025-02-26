package Models;

public class Coordinates {

    private int x;
    private Long y;

    public Coordinates(int x, Long y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public Long getY() {
        return y;
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob)return true;
        if (ob == null) return false;
        if (getClass() != ob.getClass()) return false;
        Coordinates b = (Coordinates) ob;
        if (x==b.x && y==b.y)return true;
        return false;
    }

}
