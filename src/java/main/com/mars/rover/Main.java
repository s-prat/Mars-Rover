package com.mars.rover;

import com.mars.rover.model.Plateau;
import com.mars.rover.model.Position;

public class Main {

    public static void main(String[] args) {

        Plateau plateau = new Plateau(5, 5);
        Position position = new Position(1, 2, 'N');
        boolean isValid = position.isValid(plateau);
        if(isValid) {
            position.executeCommand("LMLMLMLMM", plateau);
            System.out.println(position.getPosition());
        } else {
            System.out.println("Invalid input");
        }

        Position position2 = new Position(3, 3, 'E');
        position.executeCommand("MMRMMRMRRM", plateau);
        System.out.println(position.getPosition());


    }
}
