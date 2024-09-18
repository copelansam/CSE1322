import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args){
        float amount = 0f;
        Account userCheck = new Checkings();
        Account userSave = new Savings();

        int selection = -1;
        while (selection != 8){
            Scanner scanning = new Scanner(System.in);
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings now");
            System.out.println("8. Quit");
            selection = scanning.nextInt();

            switch (selection){
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    amount = scanning.nextFloat();
                    userCheck.withdrawal(amount);
                break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    amount = scanning.nextFloat();
                    userSave.withdrawal(amount);
                break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    amount = scanning.nextFloat();
                    userCheck.deposit(amount);
                break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    amount = scanning.nextFloat();
                    userSave.deposit(amount);
                break;
                case 5:
                    System.out.println("Your balance for checking " + userCheck.getAccount_number() + " is " + userCheck.getAccount_balance());
                break;
                case 6:
                    System.out.println("Your balance for savings " + userSave.getAccount_number() + " is " + userSave.getAccount_balance());
                break;
                case 7:
                     ((Savings)userSave).calcInterest();
                break;
            }
        }
    }
}
