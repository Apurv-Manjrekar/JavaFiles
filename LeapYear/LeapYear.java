import java.util.Scanner;

public class LeapYear{ 
    public static void main(){

        Scanner s = new Scanner(System.in);

        boolean repeat = true;
        int userYear = 0;

        System.out.println("If you ever need to end this program simply enter 0 instead of an year.");

        while(repeat == true) {
            System.out.println("\nEnter an year after 1582 AD and I will tell you if it is a leap year.");
            s.nextLine();
            if(s.hasNextInt()){
                userYear = s.nextInt();
                if (userYear == 0) {

                    System.out.println("\nThat year is not after 1582 AD and you have just ended the program.");
                    repeat = false;

                }
                else if (userYear < 1582) {

                    System.out.println("\nThat year is not after 1582 AD.");

                }
                else if (((userYear % 4) == 0) && ((userYear % 100) == 0) && ((userYear % 400) != 0)){

                    System.out.println("\nYour year is not a leap year!");

                }
                else if (((userYear % 4) == 0)) {

                    System.out.println("\nYour year is a leap year!");

                }
                else if (((userYear % 4) != 0)) {

                    System.out.println("\nYour year is not a leap year!");

                }
            }
            else{
                System.out.println("\nPlease Enter a Valid Year.");
            }

        }
    }
}