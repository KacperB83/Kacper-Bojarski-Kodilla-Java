package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Intro {
    RpsProgram program;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private String playerName;
    private int numberOfTries;

    public int getNumberOfTries() {
        return numberOfTries;
    }

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
            numberOfTries = scanner.nextInt();

            RpsProgram program = new RpsProgram();
            program.runProgram();
        }
    }
}
