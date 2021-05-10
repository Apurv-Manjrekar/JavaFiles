import java.util.Scanner;

public class ComboLockTester{
    public static void main(){

        Scanner s = new Scanner(System.in);

        String lock = "frog";

        CombinationLock comboLock = new CombinationLock(lock);

        String guess = "";
        String clue = "";

        while(!guess.equals(lock)){
            System.out.println("Enter Your Guess: ");
            guess = s.nextLine();
            clue = comboLock.getClue(guess);
            System.out.println("Clue: " + clue);
        }
    }
}