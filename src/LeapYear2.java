import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int leapYear = scanner.nextInt();
        boolean isLeapYear = (leapYear % 400 == 0) ||((leapYear % 4 == 0) && (leapYear % 100 != 0));
        if (isLeapYear){
            System.out.println(leapYear + " is a leap year" );
        }else System.out.println(leapYear + " is not a leap year ");

        //if (leapYear % 400 == 0 || leapYear % 4 == 0 && leapYear % 100 != 0) System.out.println();

    }
}
