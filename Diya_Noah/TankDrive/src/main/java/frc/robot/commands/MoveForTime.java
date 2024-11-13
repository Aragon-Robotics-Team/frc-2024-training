// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class MoveForTime extends Command {
  /** Creates a new MoveForTime. */
   private Drivetrain m_Drivetrain; 
   private double m_speed;
   private Timer m_timer = new Timer();
   private double m_Amountoftime; 

  public MoveForTime(Drivetrain drivetrain, double speed, double Amountoftime) {
    m_Drivetrain = drivetrain;
    m_speed = speed;
    m_Amountoftime = Amountoftime;
  
    // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(drivetrain);
  }
  // Called when the command is initially scheduled.
 double time1;
  @Override
  public void initialize() {
    time1 =  m_timer.get();
    m_timer.start();
  }
    
  // Called every time the scheduler runs while the command is scheduled.
  @Override
     public void execute() {
 
  m_Drivetrain.setLeftSpeed(m_speed);
  m_Drivetrain.setRightSpeed(m_speed);
    

  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (m_timer.get() - time1 >= m_Amountoftime){
    return true; 
  } else { 
      return false;
    }
  }
  }

