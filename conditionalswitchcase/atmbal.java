import java.util.Scanner;
public class atmbal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice, amount;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Updated Balance = " + balance);
                break;

            case 3:
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Updated Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Thank You");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
