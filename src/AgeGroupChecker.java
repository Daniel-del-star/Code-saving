import java.util.Scanner;

public class AgeGroupChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
    if (age < 13)
            System.out.print("You are a Child");
    else if (age <= 19) {
        System.out.print("You are a Teenager");

    } else if (age <= 59) {
        System.out.println("You are a Adult");

    }else System.out.println("You are a Senior citizen");
    }
}
