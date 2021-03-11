package com.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements InformationServiceF2D {

    @Override
    public void inform(User user) {
        System.out.println("Sending confirmation to " + user + "on email: " + user.getEmail());
    }
}
