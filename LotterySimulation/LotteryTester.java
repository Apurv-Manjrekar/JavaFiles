import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LotteryTester{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> userNum = new ArrayList();
        System.out.println("Welcome to the Lottery Program!");
        String isManual;
        boolean isInitiated = true;
        while(isInitiated){
            System.out.println("Do you want to manually input your numbers (M) or do you want me to randomly pick your numbers (R).");
            isManual = s.nextLine();
            isManual.toLowerCase();
            if(isManual.indexOf("m") >= 0){
                userNum = new ArrayList(Arrays.asList(0, 0, 0, 0, 0, 0));
                System.out.println("You chose to manually input the numbers.");
                System.out.println("Enter your #'s (Enter Numbers Between 1-42 with No Repeats) (Press Enter After Each)");
                int userInput;
                int count = 0;
                while(userNum.get(5) == 0){
                    System.out.println("Enter the next number: ");
                    userInput = s.nextInt();
                    for(int i = 0; i < userNum.size(); i++){
                        if(userInput == userNum.get(i)){
                            System.out.println("There are no repeats allowed!");
                        }
                    }
                    if(userInput < 1 || userInput > 42){
                        System.out.println("That number is not within the allocated bounds!");
                    }
                    else{
                        userNum.set(count, userInput);
                        count++;
                    }
                }
                isInitiated = false;
            }
            else if(isManual.indexOf("r") >= 0){
                userNum = new ArrayList();
                System.out.println("You chose to have a randomly selected lottery number.");
                for(Integer i = 0; i < 6; i++){
                    userNum.add((int)(Math.random() * 42) + 1);
                    for(int k = 0; k < userNum.size(); k++){
                        if(userNum.get(userNum.size() - 1) == userNum.get(k) && !(k == i)){
                            userNum.remove(userNum.size() - 1);
                            i--;
                        }
                    }
                }
                isInitiated = false;
            }
            else{
                System.out.println("That was not one of the choices! Please pick a valid input!");
            }
        }
        
        ArrayList<Integer> temp = new ArrayList();
        for(int n = 0; n < userNum.size(); n++){
            temp.add(userNum.get(n));
        }
        for(Integer m = 0; m < userNum.size(); m++){
            int min = 0;
            int minIndex = 0;
            for(int j = 1; j < temp.size(); j++){
                min = temp.get(0);
                minIndex = 0;
                if(min < temp.get(j)){
                    min = temp.get(j);
                    minIndex = j;
                }
                else{
                    min = min;
                    minIndex = minIndex;
                }
            }
            userNum.set(m, temp.remove(minIndex));
        }
        System.out.println("Your number is: ");
        System.out.println(userNum);
        double amtJackpot = 0;
        for(int x = 1; x <= 104; x++){
            double temp2 = amtJackpot;
            Lottery a = new Lottery(userNum);
            System.out.println("Lottery number " + x + ": ");
            System.out.println(a);
            amtJackpot = a.testForWinnings();
            if(amtJackpot >= temp2 + 1){
                System.out.println("Jackpot!");
            }
            else if (amtJackpot > temp2){
                System.out.println("You won a small Prize of " + ((amtJackpot - temp2) * 100000));
            }
            a.updateFrequencies();
            System.out.println();
        }
        Lottery.printData();

    }
}