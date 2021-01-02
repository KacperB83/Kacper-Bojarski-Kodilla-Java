package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Rps.Result.*;

public class RpsProgram {

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private int computerDraw;
    private String playerDraw = null;
    private int computerWins = 0;
    private int playerWins = 0;
    private boolean end = false;

    public void runProgram(int numberOfTries) {

        while (!end) {
            for (int i = 0; i < numberOfTries; i++) {
                System.out.println("Please type: \n" +
                        "1 - for ROCK \n" +
                        "2 - for PAPER \n" +
                        "3 - for SCISSORS \n" +
                        "x - to exit the game \n" +
                        "n - to restart the game");

                computerDraw = random.nextInt(3) + 1;
                playerDraw = scanner.next();

                while (!playerDraw.equalsIgnoreCase("1") && !playerDraw.equalsIgnoreCase("2") && !playerDraw.equalsIgnoreCase("3")
                        && !playerDraw.equalsIgnoreCase("x") && !playerDraw.equalsIgnoreCase("n")) {
                        System.out.println("Invalid key type. Please try again and type key 1, 2, 3, x or n.");
                        playerDraw = scanner.next();
                }
                if (playerDraw.equals("x")) {
                    System.out.println("Thank's fo the game.");
                    end = true;
                    break;
                }
                if (playerDraw.equals("n")) {
                    System.out.println("Ok. Let's try once again.");
                    Intro intro = new Intro();
                    intro.intro();
                }

                Rps.Move playerMove = Rps.Move.values()[Integer.parseInt(playerDraw) - 1];
                Rps.Move computerMove = Rps.Move.values()[computerDraw-1];

                Rps rps = new Rps();
                Rps.GameRound gameRound = new Rps.GameRound(playerMove, computerMove);
                System.out.println("Your move: "+ playerMove + " Computer move: " + computerMove);

                Rps.Result result = rps.evaluateWinner(gameRound);
                System.out.println(result);

                if(result.equals(COMPUTER_WIN)) {
                    computerWins++;
                }
                if(result.equals(PLAYER_WIN)){
                    playerWins++;
                }
            }
            end = true;
        }
        System.out.println();
        System.out.println("Your wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);

        if (playerWins > computerWins) {
            System.out.println("Great! You have won the game!");
        } else if (playerWins == computerWins) {
            System.out.println("This is tie. Let's play again");
        } else {
            System.out.println("Computer have won.");
        }
        System.out.println("Would You like to play again? Please write \"y\" (for Yes) or \"n\" (for No).");
        String yesOrNo = scanner.next();

        while (!yesOrNo.equalsIgnoreCase("y") && !yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("\nInvalid choice. Please try again and type y or n key.");
            yesOrNo = scanner.next();
        }
        if (yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("Thank's for the game.");
        } else {
            System.out.println("Let's try once again.");
            Intro intro = new Intro();
            intro.intro();
        }
    }
}

