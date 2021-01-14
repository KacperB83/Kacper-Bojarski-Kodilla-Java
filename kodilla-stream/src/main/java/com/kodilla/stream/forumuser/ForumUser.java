package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private  final int userId;
    private final String username;
    private final char gender;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int userId, final String username, final char gender,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
