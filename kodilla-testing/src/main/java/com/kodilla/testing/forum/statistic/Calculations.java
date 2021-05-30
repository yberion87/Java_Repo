package com.kodilla.testing.forum.statistic;

public class Calculations {
    private Statistics statistics;

    public Calculations(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int calcUsers(){
        return statistics.userNames().size();
    }

    public int calcPosts(){
        return statistics.postsCount();
    }

    public int calcComments(){
        return statistics.commentsCount();
    }

}
