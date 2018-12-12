// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc948.RobotBuilderTest.subsystems;

import org.usfirst.frc948.RobotBuilderTest.Robot;
import org.usfirst.frc948.RobotBuilderTest.RobotMap;
import org.usfirst.frc948.RobotBuilderTest.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftFrontMotor = RobotMap.driveLeftFrontMotor;
    private final SpeedController rightFrontMotor = RobotMap.driveRightFrontMotor;
    private final SpeedController leftRearMotor = RobotMap.driveLeftRearMotor;
    private final SpeedController rightRearMotor = RobotMap.driveRightRearMotor;
    private final RobotDrive driveTrain = RobotMap.driveDriveTrain;
    private final AnalogGyro gyro = RobotMap.driveGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new ManualDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
    
    public void drive(double leftSpeed, double rightSpeed) {
    	leftFrontMotor.set(leftSpeed);
    	rightFrontMotor.set(rightSpeed);
    	leftRearMotor.set(leftSpeed);
    	rightRearMotor.set(rightSpeed);
    }
    
    public void stopMotors() {
    	leftFrontMotor.stopMotor();
    	rightFrontMotor.stopMotor();
    	leftRearMotor.stopMotor();
    	rightRearMotor.stopMotor();
    	
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

