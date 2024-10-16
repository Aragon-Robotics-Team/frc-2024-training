// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.robot.Constants.MotorConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {

  private CANSparkMax m_motor=new CANSparkMax(MotorConstants.motorID, MotorType.kBrushless);
  /** Creates a new Motor. */
  public Motor() {
  }
    public void setMotorSpeed(double speed){
      m_motor.set(speed);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
