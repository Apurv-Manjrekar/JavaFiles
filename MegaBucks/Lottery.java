import java.util.Arrays;
import java.util.ArrayList;
public class Lottery
{

    private ArrayList<Integer> drawing;
    private static ArrayList<Integer> userChoice;
    private int bonus;

    private ArrayList<Double> prize = new ArrayList(Arrays.asList(0.0, 0.0, 0.0, 0.00001, 0.0004, 0.01));
    private ArrayList<Double> prizeWithBonus = new ArrayList(Arrays.asList(0.0, 0.0, 0.00002, 0.00005, 0.0005, 0.1));
    private static int jackpot = 0;
    private static double winnings = 0.0;
    
    private static int[] prizeFrequencies = new int[7];
    private int[] amountPrize = new int[3];
    private int[] amountPrize2 = new int[4];
    private static int[] frequencies = new int[6];
    private int[] amount = new int[6];

    public Lottery(ArrayList<Integer> a)
    {
        drawing = new ArrayList();
        userChoice = a;
        bonus = (int) ((Math.random() * 42) + 1);
        for(int i = 0; i < 6; i++){
            drawing.add((int)(Math.random() * 42) + 1);
            for(int k = 0; k < drawing.size(); k++){
                if(drawing.get(drawing.size() - 1) == drawing.get(k) && !(k == i)){
                    drawing.remove(drawing.size() - 1);
                    i--;
                }
            }
        }
        ArrayList<Integer> temp = new ArrayList();
        for(int n = 0; n < drawing.size(); n++){
            temp.add(drawing.get(n));
        }

        for(Integer m = 0; m < drawing.size(); m++){
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
            drawing.set(m, temp.remove(minIndex));
        }
    }

    public void updateFrequencies(){
        for(int i = 0; i < frequencies.length; i++){
            frequencies[i] += amount[i];
            amount[i] = 0;
        }
        prizeFrequencies[0] += amountPrize[0];
        prizeFrequencies[1] += amountPrize2[0];
        prizeFrequencies[2] += amountPrize2[1];
        prizeFrequencies[3] += amountPrize[1];
        prizeFrequencies[4] += amountPrize2[2];
        prizeFrequencies[5] += amountPrize[2];
        prizeFrequencies[6] += amountPrize2[3];
        for(int k = 0; k < amountPrize.length; k++){
            amountPrize[k] = 0;
        }
        for(int k = 0; k < amountPrize2.length; k++){
            amountPrize2[k] = 0;
        }
    }

    public double testForWinnings(){
        int winning = 0;
        int amtBonus = 0;
        for(int i = 0; i < userChoice.size(); i++){
            for(int k = 0; k < drawing.size(); k++){
                if(userChoice.get(i) == drawing.get(k) && i != k){
                    amount[i] += 1;
                }
            }
        }   

        for(int l = 0; l < userChoice.size(); l++){
            if(userChoice.get(l) == bonus){
                amtBonus++;
            }
        }

        for(int j = 0; j < amount.length; j++){
            if(amount[j] > 0){
                winning++;
            }
        }

        if(winning >= 6){
            winnings++;
            jackpot++;
        }
        if(amtBonus == 0 && winning >= 3){
            winnings += prize.get(winning);
            amountPrize[winning - 3]++;
        }
        if(amtBonus > 0 && winning >= 2){
            winnings += prizeWithBonus.get(winning);
            amountPrize2[winning - 2]++;
        }
        return winnings;
    }

    static void printData(){
        int[] winnable  = {1, 2, 5, 40, 50, 1000, 10000};
        System.out.println("Jackpots: " + jackpot);
        System.out.println("You won a total amount of " + (winnings * 100000) + " dollars!");
        System.out.println();
        System.out.println("Here are the frequencies of each type of prize you could have won: ");
        for(int i = 0; i < prizeFrequencies.length; i ++){
            System.out.println("$" + winnable[i] + ": " + prizeFrequencies[i] + " occurences");
        }
        System.out.println();
        System.out.println("The frequencies of your lottery #'s were: ");
        for(int i = 0; i < frequencies.length; i ++){
            System.out.println(userChoice.get(i) + ": " + frequencies[i] + " occurences");
        }
    }

    public String toString(){
        return(drawing + " with bonus " + bonus);
    }
}
