import java.util.Scanner;

public class Cel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = ((double) 9 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}
