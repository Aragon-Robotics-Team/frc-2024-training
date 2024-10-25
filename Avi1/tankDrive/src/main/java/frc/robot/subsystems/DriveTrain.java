// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  private TalonFX m_rightPrimary = new TalonFX(0);
  /** Creates a new DriveTrain. */
    private TalonFX m_rightSecondary = new TalonFX(1);
    private TalonFX m_leftPrimary = new TalonFX(2);
    private TalonFX m_leftSecondary = new TalonFX(3);
    private Follower m_leftFollower= new Follower(2,false);
    private Follower m_rightFollower = new Follower(0, false);

  public DriveTrain() {
    m_leftSecondary.setControl(m_leftFollower);
    m_rightSecondary.setControl(m_rightFollower);

  }
  public void setRightSpeed(double speed){
m_rightPrimary.set(speed);

  }
  public void setLeftSpeed(double speed){
    m_leftPrimary.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
