import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10); //5
        int number2 = (int) (Math.random() * 10); // 5
        if (number1 < number2){
            int temp = number1; //0
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + "-" + number2 + "? ");
        int answer = scanner.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("Correct😁👌");
        }else {
            System.out.println("wrong answer😢👎 ");
            System.out.println(number1 + "-" + number2 + " should be " + (number1 - number2));
        }

        }
    }
