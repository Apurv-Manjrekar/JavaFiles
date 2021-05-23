import java.util.Scanner;

public class RPS{ 
    public static void main(){

        Scanner s = new Scanner(System.in);

        System.out.println("Let's play Rock, Paper, Scissors! You can stop anytime by entering 0.");

        boolean keepPlaying = true;

        System.out.println("Choose Rock, Paper or Scissor! (Use R, P or S for your pick!)");

        int userScore = 0;
        int computerScore = 0;
        int tieScore = 0;

        while (keepPlaying == true){

            String userInput = s.nextLine();

            if (userInput.equals("R") || userInput.equals("P") || userInput.equals("S") || userInput.equals("r") || 
            userInput.equals("p") || userInput.equals("s")) {

                int RPS = (int) (Math.random() * 3) + 1;

                if (RPS == 1) {

                    System.out.println("\nRock!");

                    if (userInput.equals("P") ||  userInput.equals("p")){

                        System.out.println("\nPaper beats rock! You win!");
                        userScore++;

                    }
                    else if (userInput.equals("R") ||  userInput.equals("r")){

                        System.out.println("\nTie!");
                        tieScore++;

                    }
                    else {

                        System.out.println("\nRock beats scissor! I win!");
                        computerScore++;

                    }

                    System.out.println("\nChoose Rock, Paper or Scissor! (Use R, P or S for your pick!)");

                }
                if (RPS == 2) {

                    System.out.println("\nPaper!");

                    if (userInput.equals("S") ||  userInput.equals("s")){

                        System.out.println("\nScissor beats paper! You win!");
                        userScore++;

                    }
                    else if (userInput.equals("P") ||  userInput.equals("p")){

                        System.out.println("\nTie!");
                        tieScore++;

                    }
                    else {

                        System.out.println("\nPaper beats rock! I win!");
                        computerScore++;

                    }

                    System.out.println("\nChoose Rock, Paper or Scissor! (Use R, P or S for your pick!)");

                }
                if (RPS == 3) {

                    System.out.println("\nScissor!");

                    if (userInput.equals("R") ||  userInput.equals("r")){

                        System.out.println("\nRock beats scissor! You win!");
                        userScore++;

                    }
                    else if (userInput.equals("S") ||  userInput.equals("s")){

                        System.out.println("\nTie!");
                        tieScore++;

                    }
                    else {

                        System.out.println("\nScissor beats paper! I win!");
                        computerScore++;

                    }

                    System.out.println("\nChoose Rock, Paper or Scissor! (Use R, P or S for your pick!)");

                }
            }

            else if(userInput.equals("0")){

                keepPlaying = false;

                System.out.println("\nDuring this session, you won "+ userScore + " times, I won " + computerScore + " times and we tied " + tieScore + " times.");

                System.out.println("\nHope to play with you again!");

            }
            else {

                System.out.println("\n" + userInput + " is not a viable input.");
                System.out.println("\nChoose Rock, Paper or Scissor! (Use R, P or S for your pick!)");

            }

        }
    }
}

