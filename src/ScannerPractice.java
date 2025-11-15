import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hi what is your name: ");
        String name=scanner.nextLine();
        System.out.println("Your name is: "+ name);
    }
}
