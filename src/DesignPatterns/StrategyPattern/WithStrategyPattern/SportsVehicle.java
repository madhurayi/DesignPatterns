package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
