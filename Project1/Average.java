import java.util.Scanner;

public class Average{ 
    public static void main(){

        Scanner s = new Scanner(System.in);

        System.out.println("Give 3 Integers and I will calculate the average. (Click ENTER after each number.)");

        int firstInt = s.nextInt();
        int secondInt = s.nextInt();
        int thirdInt = s.nextInt();

        double average = (firstInt + secondInt + thirdInt)/3.0;

        System.out.println("The average of " + firstInt + ", " + secondInt + ", " + thirdInt + " is " + average + ".");

    }
}