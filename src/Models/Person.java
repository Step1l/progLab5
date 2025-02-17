package Models;

import java.util.Date;


public class Person {
    private String name;
    private Date birthday;
    private double height;

    public Person(String name, Date birthday, double height){
        this.name = name;
        this.birthday = birthday;
        this.height = height;
    }
}
