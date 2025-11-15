import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a traffic light color red 1,yellow 2 or green 3: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> System.out.println("stop");
            case 2 -> System.out.println("Get Ready");
            case 3 -> System.out.println("Go");
    }
}
}