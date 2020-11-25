package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private Statistics statistics;

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgUserPosts;
    private double avgUserComments;
    private double avgCommentsOnPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        this.avgUserPosts = numberOfPosts/numberOfUsers;
        this.avgUserComments = numberOfComments/numberOfUsers;
        this.avgCommentsOnPost = numberOfComments/numberOfPosts;
    }

    public void showStatistics() {
        System.out.println(
                " Number of users on forum: " + numberOfUsers +
                        "\n Number of posts: " + numberOfPosts +
                        "\n Number of commnets: " + numberOfComments +
                        "\n Average post number on user: " + avgUserPosts +
                        "\n Average comment number on user: " + avgUserComments+
                        "\n Average comment on each post: " + avgCommentsOnPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgUserPosts() {
        return avgUserPosts;
    }

    public double getAvgUserComments() {
        return avgUserComments;
    }

    public double getAvgCommentsOnPost() {
        return avgCommentsOnPost;
    }
}
