import java.util.Scanner;

public class MonthFinder {
    public static void main(String[] args) {
        Scanner Month = new Scanner(System.in);
        System.out.println("Enter Month: ");
        int number = Month.nextInt();
        switch (number) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Api");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");

        }
    }
}