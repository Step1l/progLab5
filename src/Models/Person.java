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
    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob) return true;
        if (ob==null) return false;
        if (getClass() != ob.getClass()) return false;
        Person b = (Person) ob;
        if (name.equals(b.name)&& birthday.equals(b.birthday)&& height==b.height) return true;
        return false;
    }
}
