package com.kodilla.rps;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Would You like to play RPS game? Please write \"y\" (for Yes) or \"n\" (for No).");
        String yesOrNo = scanner.next();
        while (!yesOrNo.equalsIgnoreCase("y") && !yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("\nInvalid choice. Please try again and type y or n key.");
            yesOrNo = scanner.next();
        }
        String playerName;
        int numberOfTries;

        List<String> rps = new LinkedList<>();
        rps.add("ROCK!");
        rps.add("PAPER!");
        rps.add("SCISSORS!");
        int computerDraw;
        int playerDraw = 0;
        int computerWins = 0;
        int playerWins = 0;
        boolean end = false;
        String endGame;
        String restartGame;

        if (yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("Ok, no problem. Come back next time.");
        } else {
            System.out.println("Lets play! Please type in Your Name.");
            playerName = scanner.next();
            System.out.println("Hello " + playerName);

            System.out.println("Please type how many times You want to play?");
            numberOfTries = scanner.nextInt();

            while (!end) {
                for(int i = 0; i <numberOfTries; i++) {
                    System.out.println("Please type: \n" +
                            "1 - for ROCK \n" +
                            "2 - for PAPER \n" +
                            "3 - for SCISSORS \n" +
                            "x - to exit the game \n" +
                            "n - to restart the game");
                    computerDraw = random.nextInt(3)+1;
                    playerDraw = scanner.nextInt();
                    //String endGame = scanner.next();
                    //String restartGame = scanner.next();
                        /*if(!(playerDraw == 1) && !(playerDraw == 2) && !(playerDraw == 3)
                            && !endGame.equals("x") && !restartGame.equals("n")) {
                            System.out.println("Invalid choice. Please try again and type key 1, 2, 3, x or n.");
                        }*/
                      /*  if (endGame.equals("x")) {
                            System.out.println("Then's for the game. Bye, bye!");
                            break;
                        }
                        if (restartGame.equals("n")) {
                            System.out.println("Restarting the game.");
                            end = true;
                        }*/

                    if (computerDraw == playerDraw) {
                        System.out.println("This is tie. Next round!");
                        end = true;
                    }
                    if (computerDraw == 1 && playerDraw == 3) {
                        System.out.println("Computer have won!");
                        computerWins++;
                    }
                    if (computerDraw == 2 && playerDraw == 1) {
                        System.out.println("Computer have won!");
                        computerWins++;
                    }
                    if (computerDraw == 3 && playerDraw == 1) {
                        System.out.println("Computer have won!");
                        computerWins++;
                    }
                    if (playerDraw == 1 && computerDraw == 3) {
                        System.out.println("You have won!");
                        playerWins++;
                    }
                    if (playerDraw == 2 && computerDraw == 1) {
                        System.out.println("You have won!");
                        playerWins++;
                    }
                    if (playerDraw == 3 && computerDraw == 1) {
                        System.out.println("You have won!");
                        playerWins++;
                    }
                }
            }
            end = true;
            System.out.println();
            System.out.println("Your wins: " + playerWins);
            System.out.println("Computer wins: " + computerWins);
            if(playerWins>computerWins){
                System.out.println("Great! You have won the game!");
            } else if (playerWins==computerWins){
                System.out.println("This is tie. Let's play again");
            } else {
                System.out.println("You have bad luck. Computer have won.");
            }
        }
    }
}
