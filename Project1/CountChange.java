 
import java.util.Scanner;
import java.text.NumberFormat;

public class CountChange{ 
    public static void main(){

        Scanner s = new Scanner(System.in);

        System.out.println("I will calculate the total amount of money, in coins, you have.");

        System.out.println("How many Quarters?");
        int numQuarters = s.nextInt();

        System.out.println("How many Dimes?");
        int numDimes = s.nextInt();

        System.out.println("How many Nickels?");
        int numNickels = s.nextInt();

        System.out.println("How many Pennies?");
        int numPennies = s.nextInt();
        
        double amtQuarters = (double) numQuarters * 0.25;
        double amtDimes = (double) numDimes * 0.10;
        double amtNickels = (double) numNickels * 0.05;
        double amtPennies = (double) numPennies * 0.01;
        
        double totalMoney = amtQuarters + amtDimes + amtNickels + amtPennies;
        
        NumberFormat newFormat = NumberFormat.getCurrencyInstance();
        
        System.out.println("The total money, in coins, you have is " + newFormat.format(totalMoney));
    }   
}