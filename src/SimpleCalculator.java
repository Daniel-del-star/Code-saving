import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

                System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the operation: " +
                "(1 = Add " +
                "2 = Subtract " +
                "3 = Multiply " +
                "4 = Divide): ");


        int operation = scanner.nextInt();

        int result;

        if (operation == 1){
           result = firstNumber + secondNumber;
            System.out.println(result);
        } else if (operation==2) {
            result = firstNumber - secondNumber;
            System.out.println(result);
        } else if (operation==3) {
            result = firstNumber * secondNumber;
            System.out.println(result);


        }else if (operation==4){
            result = firstNumber / secondNumber;
            System.out.println(result);


        }else {
            System.out.println("wrong operation👎");
        }


        // ask the user to enter first number. ✔
        // And ask the user to enter the second number. ✔
        // ask user to choose operation.
        // if the user enter 1
        // add first number and second number
        // if user enters 2
        // subtract first number from second number
        // if user enters 3
        // multiply first number and second
        // if user enters 4
        // divide first number from second number
        // result
    }
}
