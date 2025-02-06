package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Utils.Robot;

@TeleOp(name = "BasicTankDrive (Blocks to Java)")
public class BasicTankDrive extends LinearOpMode{

    Robot robot = new Robot(hardwareMap);

    /**
     * This function is executed when this Op Mode is selected.
     */
    @Override
    public void runOpMode() {

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                // Put loop blocks here
                robot.setMotors(telemetry, gamepad1.left_stick_y, gamepad1.left_stick_y, -gamepad1.right_stick_y, -gamepad1.right_stick_y);

            }
        }
    }
}
