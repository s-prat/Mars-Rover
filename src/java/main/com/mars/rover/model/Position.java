package com.mars.rover.model;

public class Position {

    private int x;
    private int y;
    private char facingDirection;

    public Position() {

    }

    public Position(int x, int y, char facingDirection) {
        this.x = x;
        this.y = y;
        this.facingDirection = facingDirection;
    }

    public boolean isValid(Plateau plateau) {
        return x <= plateau.getMaxValueForX() && y<= plateau.getMaxValueForY();
    }

    private void moveLeft() {
        facingDirection = Direction.getLeft(facingDirection);
    }

    private void moveRight() {
        facingDirection = Direction.getRight(facingDirection);
    }

    private void moveForward(Plateau plateau) {
        switch(facingDirection) {
            case 'E': if(x==plateau.getMaxValueForX()) {
                x = 1;
            } else {
                x++;
            } break;
            case 'W': if(x==plateau.getMaxValueForX()) {
                x = 1;
            } else {
                x--;
            } break;
            case 'N': if(y==plateau.getMaxValueForY()) {
                y = 1;
            } else {
                y++;
            } break;
            case 'S': if(y==plateau.getMaxValueForY()) {
                y = 1;
            } else {
                y--;
            } break;
        }
    }

    /*private boolean isValidCommand(String commands) {
        char[] regex = new char[]{'L', 'R', 'M'};
        if(commands.contains(regex))
    }*/

    public void executeCommand(String commands, Plateau plateau) {
        for(char command : commands.toCharArray()) {
            if(command == 'L') {
                moveLeft();
            } else if(command == 'R') {
                moveRight();
            } else if(command == 'M') {
                moveForward(plateau);

            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getFacingDirection() {
        return facingDirection;
    }

    public Position getPosition() {
        return new Position(x, y, facingDirection);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", facingDirection=" + facingDirection +
                '}';
    }
}
