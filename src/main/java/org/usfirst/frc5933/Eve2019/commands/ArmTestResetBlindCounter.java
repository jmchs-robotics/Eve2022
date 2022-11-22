package org.usfirst.frc5933.Eve2019.commands;

import org.usfirst.frc5933.Eve2019.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 12/17/18 test to confirm how to run Commands' execute() in autonomous
 */
public class ArmTestResetBlindCounter extends Command {

    public ArmTestResetBlindCounter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.blindCounter = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
