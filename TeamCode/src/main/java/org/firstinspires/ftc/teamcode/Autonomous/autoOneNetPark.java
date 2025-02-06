package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Utils.Robot;

@Autonomous(name = "Auto Observation Zone Park")
public class autoOneNetPark extends LinearOpMode {

    Robot robot = new Robot(hardwareMap);

    /**
     * This function is executed when this Op Mode is selected.
     */

    // JUST WORK ALREADY
    @Override
    public void runOpMode() {

        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                robot.setMotors(telemetry, 0.5, 0.5, -0.5, -0.5);
                sleep(5000);
                robot.setMotors(telemetry, -0.5, -0.5, 0.5, 0.5);

            }
        }
    }
}
