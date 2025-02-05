import java.util.Scanner;

class ATM {
    private double balance;
    private int pin;
    
    public ATM(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    // PIN authentication
    public boolean authenticate(int enteredPin) {
        return this.pin == enteredPin;
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an ATM account with ₹10,000 and a default PIN (1234)
        ATM myAccount = new ATM(10000, 1234);

        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();

        if (myAccount.authenticate(enteredPin)) {
            System.out.println("\nAuthentication successful!\n");
            while (true) {
                System.out.println("===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your Balance: ₹" + myAccount.checkBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ₹");
                        double depositAmount = scanner.nextDouble();
                        myAccount.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        myAccount.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.println();
            }
        } else {
            System.out.println("Incorrect PIN. Access Denied.");
        }
        scanner.close();
    }
}