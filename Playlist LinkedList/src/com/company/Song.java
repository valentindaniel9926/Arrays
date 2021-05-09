package com.company;

public class Song {
   private String title;
   private double durationOfTheSong;

    public Song(String title, double durationOfTheSong) {
        this.title = title;
        this.durationOfTheSong = durationOfTheSong;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ":" + this.durationOfTheSong;
    }
}
