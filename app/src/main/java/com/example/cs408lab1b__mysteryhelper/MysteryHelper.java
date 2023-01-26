package com.example.cs408lab1b__mysteryhelper;

public class MysteryHelper {
    String[] fragments;
    public MysteryHelper(String[] s) {
        this.fragments = s;
    }

    public String getRandomFragment () {
        return fragments[(int) Math.floor(Math.random() * (fragments.length))];
    }
}
