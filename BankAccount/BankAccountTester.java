import java.util.Scanner;
public class BankAccountTester
{
    public static void main(){

        Scanner s = new Scanner(System.in);
        int amtCreated = 0;
        boolean inUse = true;
        String option;

        System.out.println("Do you want to create a new Bank Account? (Y or N)");
        String ans = s.nextLine();
        ans.toLowerCase();

        if(ans.equals("y")){
            System.out.println("Enter your name.");
            String name = s.nextLine();
            System.out.println("Enter your initial balance.");
            double initialBal = s.nextDouble();
            s.nextLine();

            BankAccount a0 = new BankAccount(name, initialBal);

            BankAccount[] accounts = new BankAccount[10];
            String[] accountNames = {"a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "a9"};
            accounts[amtCreated] = a0;

            System.out.println("Your account number is " + a0.getAccountNumber() + ". Don't forget it.");
            amtCreated += 1;

            while(inUse){
                System.out.println("What do you want to do next? You can: ");
                System.out.println("Deposit (D),\t Withdraw (W),\t Check Balance (B),\t Create Another Bank Account (C),\t Or EXIT (E).");
                option = s.nextLine();
                option.toLowerCase();
                if(option.equals("d")){
                    System.out.println("How much do you want to deposit?");
                    double amtToDeposit = s.nextDouble();
                    s.nextLine();
                    System.out.println("Which Account? (Enter you Account Number)");
                    int acctNum = s.nextInt();
                    s.nextLine();
                    accounts[acctNum - 1].deposit(amtToDeposit);
                    System.out.println("Your current balance is " + accounts[acctNum - 1].getBalance() + ".");
                }
                else if(option.equals("w")){
                    System.out.println("How much do you want to withdraw?");
                    double amtToWithdraw = s.nextDouble();
                    s.nextLine();
                    System.out.println("Which Account? (Enter you Account Number)");
                    int acctNum = s.nextInt();
                    s.nextLine();
                    accounts[acctNum - 1].withdraw(amtToWithdraw);
                    System.out.println("Your current balance is " + accounts[acctNum - 1].getBalance() + ".");

                }
                else if(option.equals("b")){
                    System.out.println("Which Account? (Enter you Account Number)");
                    int acctNum = s.nextInt();
                    s.nextLine();
                    System.out.println("Your current balance is " + accounts[acctNum - 1].getBalance() + ".");
                }
                else if(option.equals("c")){
                    System.out.println("Enter your name.");
                    name = s.nextLine();
                    System.out.println("Enter your initial balance.");
                    initialBal = s.nextDouble();
                    s.nextLine();

                    accounts[amtCreated] = BankAccount.createNew(name, initialBal);

                    System.out.println("Your account number is " + accounts[amtCreated].getAccountNumber() + ". Don't forget it.");
                    amtCreated += 1;
                }
                else if(option.equals("e")){
                    inUse = false;
                    System.out.println("That's fine. Come back when you want to use this ATM.");
                }
                else{
                    System.out.println("That's not a valid input.");
                }
            }
        }
        else{
            System.out.println("That's fine. Come back when you want to create a bank account.");
        }
        BankAccount.reset();
    }
}
