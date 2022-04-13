package com.mars.rover.model;

public class Plateau {

    private int maxValueForX;
    private int maxValueForY;

    public Plateau(int maxValueForX, int maxValueForY) {
        this.maxValueForX = maxValueForX;
        this.maxValueForY = maxValueForY;
    }

    public int getMaxValueForX() {
        return maxValueForX;
    }

    public int getMaxValueForY() {
        return maxValueForY;
    }
}
