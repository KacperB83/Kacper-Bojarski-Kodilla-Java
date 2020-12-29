package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Intro {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private String playerName;

    public void intro() {
        System.out.println("Hello! Would You like to play RPS game? Please write \"y\" (for Yes) or \"n\" (for No).");
        String yesOrNo = scanner.next();
        while (!yesOrNo.equalsIgnoreCase("y") && !yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("\nInvalid choice. Please try again and type y or n key.");
            yesOrNo = scanner.next();
        }
        if (yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("Ok, no problem. Come back next time.");
        } else {
            System.out.println("Lets play! Please type in Your Name.");
            playerName = scanner.next();
            System.out.println("Hello " + playerName);

            System.out.println("Please type how many times You want to play?");
            boolean typeNumber = false;
            int numberOfTries = 0;

            while (!typeNumber) {
                String result = scanner.nextLine();
                try {
                    numberOfTries = Integer.parseInt(result);
                    typeNumber = true;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Please type some number.");
                }
            }

            RpsProgram program = new RpsProgram();
            program.runProgram(numberOfTries);

        }
    }
}
