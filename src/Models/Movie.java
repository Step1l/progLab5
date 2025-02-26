package Models;

import java.time.LocalDateTime;


public class Movie {
    private Long id;
    private String name;
    private Coordinates coordinates;
    private LocalDateTime creationDate;
    private int oscarCount;
    String tagline;
    private long length;
    private MovieGenre genre;
    private Person operator;
    public Movie(Long id, String name, Coordinates coordinates, LocalDateTime creationDate,int oscarCount, String tagline, long length,MovieGenre genre, Person operator){
        this.id=id;
        this.name=name;
        this.coordinates=coordinates;
        this.creationDate = creationDate;
        this.oscarCount=oscarCount;
        this.tagline=tagline;
        this.length=length;
        this.genre=genre;
        this.operator = operator;
    }
    public Long getId(){return id;}

    public String getName(){

        return name;
    }
    public int getOscarCount(){

        return oscarCount;
    }

    public String getTagline() {

        return tagline;
    }
    public long getLength() {

        return length;
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public MovieGenre getGenre() {
        return genre;
    }
    public Person getOperator() {
        return operator;
    }
    public void setOperator(Person operator) {
        this.operator = operator;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setOscarCount(int oscarCount) {
        this.oscarCount = oscarCount;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object ob){
        if (this == ob) return true;
        if (ob==null)return false;
        if (getClass() != ob.getClass()) return false;
        Movie b = (Movie) ob;
        if (id.equals(b.id) && name.equals(b.name) && coordinates.equals(b.coordinates)&& creationDate.equals(b.creationDate)&& oscarCount==b.oscarCount && tagline.equals(b.tagline)&& length==b.length && genre.equals(b.genre)&&operator.equals(b.operator)){
            return true;
        }
        return false;
    }

}
