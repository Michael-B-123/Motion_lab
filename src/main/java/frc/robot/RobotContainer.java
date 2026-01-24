// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {

  //private Robot robot;

  
  SendableChooser<Command> m_chooser = new SendableChooser<>();


  public CommandXboxController DriveController = new CommandXboxController(0);
  CommandXboxController coDriveController = new CommandXboxController(1);
  CommandXboxController ohShitController = new CommandXboxController(2);
  
    public RobotContainer() {

    //robot = new_robot;
    configureBindings();
    //m_chooser.setDefaultOption("taxi", robot.taxi);
    //m_chooser.addOption("shoot", robot.shoot);
    //m_chooser.addOption("shoot and taxi", robot.shoot.andThen(robot.taxi));
    //SmartDashboard.putData(m_chooser);
  }

  private void configureBindings() {
  

  }
}
