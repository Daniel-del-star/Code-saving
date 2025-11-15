import java.util.Scanner;

public class StatementAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age to vote: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("yes you can vote👍");
        }else{
            System.out.println("No you can not vote👎");
        }
    }
}