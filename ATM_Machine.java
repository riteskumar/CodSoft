import java.util.Scanner;

class ATM {
    private final int pin = 9818;
    int bal;
    Scanner sc = new Scanner(System.in);

    protected void checkPin(int num, int c) {

        if (pin == num) {
            System.out.println();
            menu();
        }
        if (c < 1) {
            System.out.println("Sorry for inconvenience!!!");
            return;
        } else {
            System.out.println("Incorrect pin number");
            System.out.format("You have %d attempts after that your account will be suspend", c);
            c--;
            System.out.print("\nEnter your PIN NUMBER = ");
            num = sc.nextInt();
            checkPin(num, c);
        }
    }

    public void menu() {

        System.out.print("1. Check bank balance \t\t");
        System.out.print("2. Withdraw money\t\t ");
        System.out.print("\n3. Fast Withdrawal \t\t");
        System.out.print("\t4. Deposit money \t\t");
        System.out.println("\n5. Exit \n");
        System.out.print("Select an option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                balanceCheck();
                menu();
                break;

            case 2:
                withdraw();
                menu();
                break;

            case 3:
                fastWithdraw();
                menu();

            case 4:
                deposit();
                menu();
                break;

            case 5:
                System.out.println("Thank You, SEE YOU SOON");
                System.exit(0);
                break;

            default:
                System.out.println("Choose a valid option\n");
                menu();
        }
    }

    protected void balanceCheck() {
        System.out.println("Your Account balance : " + bal + "\n");
    }

    protected void withdraw() {
        if (bal < 100) {
            System.out.println("Bank balance should have at least 100 Rs\n");
            menu();
        }
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (amount > bal) {
            System.out.println("Insufficient balance");
        } else {
            bal = bal - amount;
            System.out.println("Please Wait...");
            System.out.println("Money withdraw successfully");
            System.out.print("Do you want to check bank balance ?(Yes / No) : ");
            String p = sc.next();
            if (p.equals("Yes") || p.equals("yes")) {
                balanceCheck();
            }
        }
    }

    protected void withdraw(int num) {
        if (num > bal) {
            System.out.println("Insufficient balance");
            return;
        }
        bal = bal - num;
        System.out.println("Please Wait...");
        System.out.println("Money withdraw successfully");
        System.out.print("Do you want to check bank balance ?(Yes / No) : ");
        String p = sc.next();
        if (p.equals("Yes") || p.equals("yes")) {
            balanceCheck();
        }
    }

    protected void fastWithdraw() {
        if(bal < 100){
            System.out.println("Bank balance should have at least 100 Rs\n");
            menu();
        }
        System.out.print("1. 200 \t\t");
        System.out.print("\t2. 500 \t\t");
        System.out.print("\n3. 1000 \t");
        System.out.print("\t4. 2000 \t\t");
        System.out.println("\n5. 5000 \t\t");
        System.out.print("Select an option: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                withdraw(200);
                break;

            case 2:
                withdraw(500);
                break;

            case 3:
                withdraw(1000);
                break;

            case 4:
                withdraw(2000);
                break;
            case 5:
                withdraw(5000);
                break;

            default:
                System.out.println("Enter correct option, Thank you");
        }
    }

    protected void deposit() {

        System.out.print("Enter the amount: ");
        int amt = sc.nextInt();
        if (amt < 0) {
            System.out.println("Error!!! Please fill correct amount");
        } else if (amt >= Integer.MAX_VALUE) {
            System.out.println("We need your PAN NUMBER");
            System.out.println("Please deposit at your branch");
            return;
        } else {
            bal += amt;
            System.out.println("Money deposit successfully\n");
        }
    }
}

class User extends ATM {
    protected void balanceCheck() {
        System.out.println("\nYour Account balance : " + bal + " Rs"+"\n");
    }
}
public class ATM_Machine {
    public static void main(String[] args) {
        User A = new User();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN NUMBER = ");
        int n = sc.nextInt();
        A.checkPin(n, 3);
    }
}
