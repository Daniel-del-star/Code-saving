package htmlpractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int factorial =1;
        for (int w = 1; w <= number; w++) {
            factorial = factorial*w;

        }
        System.out.println("The factorial of "+number+ " is "+factorial );
        }
    }