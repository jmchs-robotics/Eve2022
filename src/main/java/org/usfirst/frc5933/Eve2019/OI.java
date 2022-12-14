// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5933.Eve2019;

import org.usfirst.frc5933.Eve2019.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc5933.Eve2019.subsystems.*;
import org.usfirst.frc5933.Eve2019.subsystems.Arm.ArmPosition;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released  and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());


	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public Joystick driverStick;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	public JoystickButton driverA;
	public JoystickButton driverB;
	public JoystickButton driverX;
	public JoystickButton driverY;
	public JoystickButton driverBumperL;
	public JoystickButton driverBumperR;
	public JoystickButton driverBack;
	public JoystickButton driverStart;
	public JoystickButton driverLStick;
	public JoystickButton driverRStick;

	public Joystick subStick;

	public JoystickButton subA;
	public JoystickButton subB;
	public JoystickButton subX;
	public JoystickButton subY;
	public JoystickButton subBumperL;
	public JoystickButton subBumperR;
	public JoystickButton subBack;
	public JoystickButton subStart;
	public JoystickButton subLStick;
	public JoystickButton subRStick;

	public OI() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

		driverStick = new Joystick(0);

		// SmartDashboard Buttons
		//		SmartDashboard.putData("Drive Straight Gyro", new DriveStraightGyro(5,.5));

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		driverA = new JoystickButton(driverStick, 1);
		driverA.whileHeld(new VisionTurnToSetTarget(0.5, SocketVisionSender.StartDepth, 1));

		driverB = new JoystickButton(driverStick, 2);
		driverB.whileHeld(new DriveStraightVision(0.5, SocketVisionSender.StartDepth, 0.4));

		driverX = new JoystickButton(driverStick, 3);
		driverX.whileHeld(new EndGameClimber(1));

		driverY = new JoystickButton(driverStick, 4);
		driverY.whenPressed(new EndGameTrigger());
//
//		driverBumperL = new JoystickButton(driverStick, 5);
//		driverBumperL.whenPressed(new NullCommand());
//
//		driverBumperR = new JoystickButton(driverStick, 6);
//		driverBumperR.whenPressed(new NullCommand());
//
		driverBack = new JoystickButton(driverStick, 7);
		driverBack.whenPressed(new EndGameClimber(-1));
//
//		driverStart = new JoystickButton(driverStick, 8);
//		driverStart.whenPressed(new NullCommand());
//
//		driverLStick = new JoystickButton(driverStick, 9);
//		driverLStick.whenPressed(new NullCommand());
//
//		driverRStick = new JoystickButton(driverStick, 10);
//		driverRStick.whenPressed(new NullCommand());
//		//end driver stick buttons

		subStick = new Joystick(1);

		/*
		 * 181212 enabling subA and subB and using to raise/lower the arm
		 */
		subA = new JoystickButton(subStick, 1);
		subA.whileHeld(new MoveArmUp());
		        
		subB = new JoystickButton(subStick, 2);
		subB.whileHeld(new MoveArmDown());

		subX = new JoystickButton(subStick, 3);
		subX.whileHeld(new LowerElevator());

		subY = new JoystickButton(subStick, 4);
		subY.whileHeld(new RaiseElevator());

		subBumperL = new JoystickButton(subStick, 5);
		subBumperL.whenPressed(new OpenTongs(true));

		subBumperR = new JoystickButton(subStick, 6);
		subBumperR.whenPressed(new CloseTongs(true));

//		subBack = new JoystickButton(subStick, 7);
//		subBack.whileHeld(new NullCommand());
//
//		subStart = new JoystickButton(subStick, 8);
//		subStart.whenPressed(new NullCommand());

		// all of subLStick commented out 181212
		// subLStick = new JoystickButton(subStick, 9);  
		// subLStick.whenPressed(new MoveArmToPos(ArmPosition.Continuous, false));
		// subLStick.whenReleased(new MoveArmToPos(ArmPosition.Start, false));

//		subRStick = new JoystickButton(subStick, 10);
//		subRStick.whenPressed(new NullCommand());
	}

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
	public Joystick getDriverStick() {
		return driverStick;
	}

	public Joystick getSubStick() {
		return subStick;
	}


	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}