import java.util.Scanner;

public class ScannerAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius= scanner.nextDouble();
        double area= radius*radius*3.14159;
        double length = scanner.nextDouble();
        double volume = area*length;
        System.out.println("The area for the cylinder of radius is "+ area);
        System.out.println("The volume is "+ volume);



     }
}
