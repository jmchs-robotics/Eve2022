package org.usfirst.frc5933.Eve2019.commands;

import org.usfirst.frc5933.Eve2019.Robot;
import org.usfirst.frc5933.Eve2019.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

public class DefaultElevator extends Command {

    public DefaultElevator() {
        requires(Robot.elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.elevator.setMotor(0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
