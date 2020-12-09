package com.kodilla.rps;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RpsProgram {

    Intro intro;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private String yesOrNo = scanner.next();

    private String playerName;
    private int numberOfTries;

    private int computerDraw;
    private String playerDraw = null;
    private int computerWins = 0;
    private int playerWins = 0;
    private boolean end = false;
    private List<String> rps = new LinkedList<>();

    public void runProgram(int numberOfTries) {
        rps.add("ROCK!");
        rps.add("PAPER!");
        rps.add("SCISSORS!");

        while (!end) {
            for(int i = 0; i < this.numberOfTries; i++) {
                System.out.println("Please type: \n" +
                        "1 - for ROCK \n" +
                        "2 - for PAPER \n" +
                        "3 - for SCISSORS \n" +
                        "x - to exit the game \n" +
                        "n - to restart the game");
                computerDraw = random.nextInt(3)+1;
                playerDraw = scanner.next();

                if(!playerDraw.equals("1") && !playerDraw.equals("2") && !playerDraw.equals("3")
                        && !playerDraw.equals("x") && !playerDraw.equals("n") && playerDraw.equals(null)) {
                    System.out.println("Invalid key type. Please try again and type key 1, 2, 3, x or n.");
                }
                if (playerDraw.equals("x")) {
                    System.out.println("Thank's fo the game. Bye.");
                    end = true;
                    break;
                }
                if (playerDraw.equals("n")) {
                    System.out.println("Ok. Let's try once again.");
                    intro.intro();
                }

                String draws = "You : " + rps.get(Integer.parseInt(playerDraw)-1) +
                        " Computer: " + rps.get(computerDraw-1);

                System.out.println(draws);

                if (computerDraw == 1 && playerDraw.equals("3")) {
                    System.out.println("Computer have won!\n");
                    computerWins++;
                }
                if (computerDraw == 2 && playerDraw.equals("1")) {
                    System.out.println("Computer have won!\n");
                    computerWins++;
                }
                if (computerDraw == 3 && playerDraw.equals("2")) {
                    System.out.println("Computer have won!\n");
                    computerWins++;
                }
                if (playerDraw.equals("1") && computerDraw == 3) {
                    System.out.println("You have won!\n");
                    playerWins++;
                }
                if (playerDraw.equals("2") && computerDraw == 1) {
                    System.out.println("You have won!\n");
                    playerWins++;
                }
                if (playerDraw.equals("3") && computerDraw == 2) {
                    System.out.println("You have won!\n");
                    playerWins++;
                }
                int player = Integer.parseInt(playerDraw);
                if (player==computerDraw) {
                    System.out.println("This is tie. Next round!\n");
                }
            }
            end = true;
        }
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

