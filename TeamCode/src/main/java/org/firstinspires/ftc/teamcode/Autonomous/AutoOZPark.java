package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Utils.Robot;

@Autonomous(name = "Auto Observation Zone Park")
public class AutoOZPark extends LinearOpMode {


    /**
     * This function is executed when this Op Mode is selected.
     */

    // JUST WORK ALREADY
    Robot robot = new Robot(hardwareMap);
    @Override
    public void runOpMode() {
        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                robot.setMotors(telemetry, 0.5, 0.5, -0.5, -0.5);
            }
        }
    }
}
