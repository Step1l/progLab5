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
}
