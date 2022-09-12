import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //output
        System.out.println("Hello world!");

        //gets user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}