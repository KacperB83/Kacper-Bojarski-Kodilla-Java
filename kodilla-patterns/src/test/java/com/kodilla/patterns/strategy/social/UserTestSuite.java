package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User michal = new Millenials("Michael K");
        User jakub = new YGeneration("Kuba2003");
        User alan = new ZGeneration("Alanson");
        //When
        String michalIsUsing = michal.sharePost();
        System.out.println(michal.getUsername() + " is using: " + michalIsUsing);
        String jakubIsUsing = jakub.sharePost();
        System.out.println(jakub.getUsername() + " is using: " + jakubIsUsing);
        String alanIsUsing = alan.sharePost();
        System.out.println(alan.getUsername() + " is using: " + alanIsUsing);
        //Then
        assertEquals("==== FACEBOOK ====", michalIsUsing);
        assertEquals("==== TWITTER ====", jakubIsUsing);
        assertEquals("==== SNAPCHAT ====", alanIsUsing);

    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User michal = new Millenials("Michael K");
        //When
        String michalIsUsing = michal.sharePost();
        System.out.println(michal.getUsername() + " is using: "+ michalIsUsing);
        michal.setShareMedia(new TwitterPublisher());
        michalIsUsing = michal.sharePost();
        System.out.println(michal.getUsername() + " has used: " + michalIsUsing);
        //Then
        assertEquals("==== TWITTER ====", michalIsUsing);
    }
}
