// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends Command {
  /** Creates a new ArcadeDrive. */
  private Joystick m_joystick;
  private DriveTrain m_drivetrain;
  public ArcadeDrive(Joystick joystick, DriveTrain drivetrain ) {
      m_joystick=joystick;
      m_drivetrain=drivetrain;
      
    // Use addRequirements() here to declare subsystem dependencies.
  }
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = m_joystick.getRawAxis(3);
    double turnSpeed = m_joystick.getRawAxis(2);

    m_drivetrain.setLeftSpeed(speed+turnSpeed);
    m_drivetrain.setRightSpeed(speed-turnSpeed);

     


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.setLeftSpeed(0);
    m_drivetrain.setRightSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
