package loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int answer = scanner.nextInt();

        for (int i = 1; i <= answer; i++){
           sum += i;
        }
        System.out.println("The sum from 1 to " + answer + " is: " + sum);

        // 1 2 3 4 5
    }
}
