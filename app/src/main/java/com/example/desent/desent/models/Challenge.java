package com.example.desent.desent.models;

/**
 * Created by ragnhildlarsen on 17.03.2018.
 */

public class Challenge {

    private int id;
    private String title;
    private String description;
    private double duration;
    private String prize;

    public Challenge(int id, String title, String description, double duration, String prize) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.prize = prize;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getDuration() {
        return duration;
    }

    public String getPrize() {
        return prize;
    }


}
