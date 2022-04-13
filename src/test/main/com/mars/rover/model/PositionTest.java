package com.mars.rover.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    private Position position;

    @Test
    public void testExecuteCommandsForInput1() {
        Plateau plateau = new Plateau(5, 5);
        position = new Position(1, 2, 'N');

        String commands = "LMLMLMLMM";
        position.executeCommand(commands, plateau);
        assertEquals(1, position.getX());
        assertEquals(3, position.getY());
        assertEquals('N', position.getFacingDirection());
    }

    @Test
    public void testExecuteCommandsForInput2() {
        Plateau plateau = new Plateau(5, 5);
        position = new Position(3, 3, 'E');

        String commands = "MMRMMRMRRM";
        position.executeCommand(commands, plateau);
        assertEquals(5, position.getX());
        assertEquals(1, position.getY());
        assertEquals('E', position.getFacingDirection());
    }

}
