package org.usfirst.frc.team3067.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	RobotInstance grunchBot;
	//RobotDrive myDrive = new RobotDrive(1,3,2,4);//frontleft, backleft, frontright, back right
	//myDrive.setInvertedMotor(myDrive.MotorType kFrontLeft, true);	// invert the left side motors
	//myDrive.setInvertedMotor(MotorType.kRearLeft, true);
	//RobotDrive robo = new RobotDrive
	public void robotInit(){
		grunchBot  = new RobotInstance();
	}
	
	public void autonomousInit(){
		
	}
	
	public void autonomousPeriodic(){
		
	}
	
	public void teleopInit(){

	}
	
	public void teleopPeriodic(){
		grunchBot.update();
		SmartDashboard.putNumber("Gyro Angle", grunchBot.stickoBoyo.newgyro.getAngle());
		}
}
