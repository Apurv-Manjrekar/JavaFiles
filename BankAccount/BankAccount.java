public class BankAccount 
{
    /** Instance Variables & Class Variables Go Here */
    private String ownerName;
    private int accountNumber = 0;
    private double balance;
    private static int accountsCreated = 0;
    /** Constructs a bank account by defining its owner, account 
     *  number, and initial balance
     */
    public BankAccount(String own, double init)
    {
        ownerName = own;
        balance = init;
        accountsCreated = accountsCreated + 1;
        accountNumber = accountsCreated;
    }
    public BankAccount(String own)
    {
        ownerName = own;
        balance = 0;
        accountNumber = (int) (Math.random() * 100000);
        accountsCreated += 1;
    }

    /** Validates the transaction can be done, then deposits the   
     *  specified amount into the account. Returns the new balance.
     */
    public void deposit(double amount)
    {
        if(amount <= 0){
            System.out.println("ERROR - Insufficient Funds");
        }
        balance += amount;
    }

    /** Validates the transaction can be done, then withdraws the 
     *  specified amount from the account. Returns the new balance.
     */
    public void withdraw(double amount)
    {
        if(amount >= balance){
            System.out.println("ERROR - Insufficient Funds");
        }
        else{
            balance -= amount;
        }
    }

    /** Returns the current balance of the account
     */
    public double getBalance()
    {
        return balance;
    }

    /** Returns the account number
     */
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public String getName(){
        return ownerName;
    }
    
    /** Returns a one-line description of the account as a string, 
     *  tab separated:  account number, then  name, then balance
     */
    public String toString(){
        return accountNumber + ",\t" + ownerName + ",\t" + balance;
    }
    
    public static BankAccount createNew(String n, double i){
        BankAccount b = new BankAccount(n, i);
        return b;
    }
    public static void reset(){
        accountsCreated = 0;
    }
}

/*
Additional stuff
→ When deposit() and withdraw() validate the inputs and find something that is not acceptable,  System.out.println() a message like “ERROR - Insufficient Funds” 

→ Once you have this working, go back and overload the constructor. I think it makes sense to allow someone to create an account without specifying an initial balance - in which case I would assume the initial balance is $0. 

→ Now write some tester code. Create at least 3 bank account objects and show that all methods you’ve written work. 

→ Change your tester code so that it is like using an ATM machine. It gives the users options and lets them choose what they want to do. Be creative with this - I’m intentionally leaving it open ended. 
 */