import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double accountBalance = 1000;
        String menu = """
                *************************
                Welcome to CHASE Bank
                =========================
                1. Check Balance
                2. Withdraw Money
                3. Deposit money
                ********************
                """;
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1){
            System.out.println("$" +accountBalance);

        } else if (choice == 2) {
            System.out.print("Enter you pin: ");
            scanner.nextInt();
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            if (amount <= accountBalance){
                double balance = accountBalance-amount;
                System.out.println("Withdrawal successful🎇🎆🧨🧨🎇");
                System.out.println("Balance: " + balance);
            }else {
                System.out.println("Insufficient funds");
                System.out.println("Your account balance is: " + accountBalance);

            }

        }

    }
}
