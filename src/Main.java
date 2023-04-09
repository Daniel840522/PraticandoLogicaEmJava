
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        String name = "Sara Connor";
        String accountType = "Checking Account";
        double balance = 2500.0;
        int choice = 0;

        System.out.println("********************************");
        System.out.println("Customer name is: " + name);
        System.out.println("Account type is: " + accountType);
        System.out.println("The account balance is: " + balance);
        System.out.println("********************************");

        String menu = """
                Menu
                __________________
                1 - Check balance
                2 - Cash deposit
                3 - Withdraw money
                4 - Exit
                __________________
                Choose your option:
                """;
        Scanner option = new Scanner(System.in);

        while (choice != 4) {

            System.out.println(menu);
            choice = option.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    Scanner cash = new Scanner(System.in);
                    System.out.println("Enter the value: ");
                    double newValue = cash.nextDouble();
                    balance += newValue;
                    break;
                case 3:
                    Scanner money = new Scanner(System.in);
                    System.out.println("Enter the value: ");
                    double lostMoney = money.nextDouble();
                    balance -= lostMoney;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Choose a correct option");
                    break;
            }
        }
    }
}
