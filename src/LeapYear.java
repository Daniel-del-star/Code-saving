import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int leapyear = scanner.nextInt();
        if (leapyear >= 2024) {
            System.out.println("2024 is a leap year✨🧨");
            
        } else if (leapyear >= 2023) {
            System.out.println("2023 is not a leap year👎👎");

            
        } else if (leapyear >= 2016) {
            System.out.println("2016 is a leap year😁🧨");


        } else if (leapyear >= 2020) {
            System.out.println("2020 is a leap year✔👍👍");

        } else if (leapyear >= 2022) {
            System.out.println("2022 is not a leap year👎😢");

        }
    }
}