import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    void printMessage(String message){
        System.out.println(message);
    }
    String ask(String question){
        System.out.println(question);
        return scanner.next();
    }
}
