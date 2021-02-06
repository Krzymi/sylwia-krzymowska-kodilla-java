package com.kodilla.testing.forum.statistics;

public class MesureStatistics {
    private int userNumbers;
    private int postsNumbers;
    private int commentNumbers;
    private double postsPerUserAvg;
    private double commetsPerUSerAvg;
    private double commentsPerPostAvg;

    public MesureStatistics() {
        this.userNumbers = userNumbers;
        this.postsNumbers = postsNumbers;
        this.commentNumbers = commentNumbers;
        this.postsPerUserAvg = postsPerUserAvg;
        this.commetsPerUSerAvg = commetsPerUSerAvg;
        this.commentsPerPostAvg = commentsPerPostAvg;
    }

    public int getUserNumbers() {
        return userNumbers;
    }

    public int getPostsNumbers() {
        return postsNumbers;
    }

    public int getCommentNumbers() {
        return commentNumbers;
    }

    public double getPostsPerUserAvg() {
        return postsPerUserAvg;
    }

    public double getCommetsPerUSerAvg() {
        return commetsPerUSerAvg;
    }

    public double getCommentsPerPostAvg() {
        return commentsPerPostAvg;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userNumbers = statistics.usersNames().size();
        postsNumbers = statistics.postsCount();
        commentNumbers = statistics.commentsCount();

        if (userNumbers == 0 || postsNumbers == 0) {
            int postsPerUserAvg = 0;
        } else {
            postsPerUserAvg = postsNumbers / userNumbers;
        }

        if (userNumbers == 0 || commentNumbers == 0) {
            int commetsPerUSerAvg = 0;
        } else {
            commetsPerUSerAvg = commentNumbers / userNumbers;
        }

        if (commentNumbers == 0 || postsNumbers == 0) {
            int commentsPerPostAvg = 0;
        } else {
            commentsPerPostAvg = commentNumbers / postsNumbers;
        }
    }

    public void showStatistics() {
        System.out.println("Users quantity is: " + userNumbers);
        System.out.println("Posts quantity is: " + postsNumbers);
        System.out.println("Comments quantity is: " + commentNumbers);
        System.out.println("Posts average per user is:" + postsPerUserAvg);
        System.out.println("Comments average per user is:" + commetsPerUSerAvg);
        System.out.println("Comments average per post is:" + commentsPerPostAvg);
    }
}
