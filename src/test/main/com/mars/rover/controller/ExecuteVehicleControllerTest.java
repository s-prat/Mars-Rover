package com.mars.rover.controller;

import com.mars.rover.model.Direction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ExecuteVehicleControllerTest {

    private ExecuteVehicleController executeVehicleController;

    @BeforeEach
    public void setUp() {
        executeVehicleController = new ExecuteVehicleControllerImpl();
    }

    @ParameterizedTest
    @EnumSource(Direction.class)
    public void testTurnLeft(Direction direction) {
        String dir = direction.name();

    }
}
