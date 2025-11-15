import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter a fun fact about you: ");
        String funFact = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Your name is "+ name + " and you're " + age + " years old " + " and a fun fact about you is " + funFact);

    }
}
