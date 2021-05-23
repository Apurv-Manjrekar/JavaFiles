import java.util.Scanner;

public class AdvPalindrome{ 
    public static void main(){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter any string of characters and I will tell you if it is a palindrome.");
        String userString = s.nextLine();

        String userStringLetters = userString.replaceAll("[[^a-z] && [^A-Z]]", "");

        int stringMid = userStringLetters.length() / 2;
        if (userStringLetters.length() % 2 == 0) {

            String firstHalf = userStringLetters.substring(0, stringMid);
            String secondHalf = userStringLetters.substring(stringMid);

            String reverseSecondHalf = "";
            reverseSecondHalf += secondHalf.substring(secondHalf.length());

            for (int reverse = secondHalf.length() - 1; reverse >= 0; reverse--){

                reverseSecondHalf += secondHalf.substring(reverse, reverse + 1);

            }
            if (firstHalf.compareToIgnoreCase(reverseSecondHalf) == 0) {
                System.out.println("Yes, your string is a palindrome!");
            }
            else {

                System.out.println("No, your string is not a palindrome!");

            }
        }
        else{

            String firstHalf = userStringLetters.substring(0, stringMid + 1);
            String secondHalf = userStringLetters.substring(stringMid);

            String reverseSecondHalf = "";
            reverseSecondHalf += secondHalf.substring(secondHalf.length());

            for (int reverse = secondHalf.length() - 1; reverse >= 0; reverse--){

                reverseSecondHalf += secondHalf.substring(reverse, reverse + 1);
            }
            if (firstHalf.compareToIgnoreCase(reverseSecondHalf) == 0) {

                System.out.println("Yes, your string is a palindrome!");

            }
            else {

                System.out.println("No, your string is not a palindrome!");

            }
        }
    }
}