package com.mars.rover.model;

public enum Direction {
    NORTH('N', 'E', 'W'),
    SOUTH('S', 'W', 'E'),
    EAST('E', 'S', 'N'),
    WEST('W', 'N', 'S');

    private char value;
    private char left;
    private char right;

    Direction(char value, char left, char right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Direction getDirection(char facingDir) {
        for(Direction dir : Direction.values()) {
            if(dir.value == facingDir) {
                return dir;
            }
        }
        return Direction.NORTH;
    }

    public static char getLeft(char facingDir) {
        for(Direction dir : Direction.values()) {
            if(dir.value == facingDir) {
                return dir.left;
            }
        }
        return ' ';
    }

    public static char getRight(char facingDir) {
        for(Direction dir : Direction.values()) {
            if(dir.value == facingDir) {
                return dir.right;
            }
        }
        return ' ';
    }
}
