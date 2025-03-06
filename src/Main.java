import Catcher.Handler;
import IO.Console;
import IO.ConsoleWorker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Handler run = new Handler(new ConsoleWorker());
        run.run();
        Date birthday = Date.from(LocalDate.of(Integer.parseInt("2010"),Integer.parseInt("10"),Integer.parseInt("10")).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(birthday.getTime());

    }
}