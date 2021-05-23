import java.util.Scanner;

public class StringToChar{ 
    public static void main(){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string and I'll break it up into the characters!");

        String userString = s.nextLine();

        int charNum = 0;

        while (charNum < userString.length()) {

            System.out.println(userString.substring(charNum, (charNum + 1)));
            
            charNum++;
            
        }
    }
}