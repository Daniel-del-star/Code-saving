import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int grade = scanner.nextInt();
        if (grade >= 90) {
            System.out.println('A');
            System.out.println("EXCELLENT");


        } else if (grade >= 80) {
            System.out.println('B');
            System.out.println("Very Good");

        } else if (grade >= 70) {
            System.out.println('C');
            System.out.println("Good");

        } else if (grade >= 60) {
            System.out.println('D');
            System.out.println("Fair");

        }else
            System.out.println('F');

    }
}
