package Builders;

import IO.Console;
import Models.Person;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class PersonBuilder {
    private static PersonBuilder instance;

    private PersonBuilder(){}

    public static PersonBuilder getInstance(){
        return instance == null? instance = new PersonBuilder() : instance;
    }

    public Person build(Console console){
        String name = console.ask("name:");
        String[] parsesDay = console.ask("birhday:").split(" ");
        Date birthday = Date.from(LocalDate.of(Integer.parseInt(parsesDay[2]),Integer.parseInt(parsesDay[1]),Integer.parseInt(parsesDay[0])).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Double height = Double.parseDouble(console.ask("height:"));
        return new Person(name,birthday,height);

    }
}
