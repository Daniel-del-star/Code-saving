package htmlpractice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 positive numbers: ");
        int largestNumber = scanner.nextInt();
        for (int r = 1; r <= 10; r++) {
            System.out.print("Enter 10 positive numbers: ");
            int secondNumber = scanner.nextInt();
            if (secondNumber > largestNumber){
                largestNumber =secondNumber;
            }
            System.out.println("Largest number is: " + largestNumber + " Second number is: " + secondNumber);

        }
        System.out.println("Largest number is "+ largestNumber);
    }
}