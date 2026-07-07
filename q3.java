import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();

                    balance += deposit;

                    System.out.println("Deposit Successful!");
                    System.out.println("New Balance = ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance = ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance!");
                    }

                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}