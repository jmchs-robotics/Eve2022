package org.usfirst.frc5933.Eve2019.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc5933.Eve2019.Robot;
import org.usfirst.frc5933.Eve2019.RobotMap;
import org.usfirst.frc5933.Eve2019.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;

import com.revrobotics.REVLibError;

public class Elevator extends Subsystem {

    private CANSparkMax elevatorMotor;
    
    public void initDefaultCommand() {
        setDefaultCommand(new DefaultElevator());
    }   

    public void init() {
    }

    public void setMotor(double speed) {
        elevatorMotor.set(speed);
    }

    public void stopMotor() {
        setMotor(0);
    }
}