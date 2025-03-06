package IO;

import java.util.Scanner;

public class ConsoleWorker implements Console {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void printMessage(String message){

        System.out.println(message);
    }
    @Override
    public String ask(String question){
        System.out.println(question);
        return scanner.next();
    }

}
