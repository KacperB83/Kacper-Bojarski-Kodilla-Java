package com.kodilla.good.patterns.challenges.orderService;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println(" Sending mail to " + user + " on email: "+ user.getEmail());
    }

}