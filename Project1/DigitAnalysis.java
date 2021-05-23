import java.util.Scanner;

public class DigitAnalysis{ 
    public static void main(){

        Scanner s = new Scanner(System.in);

        int numEvens = 0;
        int numOdds = 0;
        System.out.println("Enter an integer between 1,000,000 and 1,000,000,000. (Don't use commas.)");

        int userInt = s.nextInt();

        while (userInt < 1000000 || userInt > 1000000000) {
            System.out.println("That is not within the required parameters. \nEnter an integer between 1,000,000 and 1,000,000,000. (Don't use commas.)");

            userInt = s.nextInt();
        }

        while (userInt > 0) {
            int digit = userInt % 10;
            if (digit % 2 == 0) {

                numEvens++;

            }
            else {

                numOdds++;

            }

            userInt = userInt / 10;
        }
        System.out.println("Your integer has " + numEvens + " evens and " + numOdds + " odds.");
    }
}