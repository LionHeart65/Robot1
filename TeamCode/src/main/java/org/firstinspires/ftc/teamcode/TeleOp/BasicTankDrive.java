package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "BasicTankDrive (Blocks to Java)")
public class BasicTankDrive extends LinearOpMode {

    private DcMotor frontLeft;
    private DcMotor backLeft;
    private DcMotor frontRight;
    private DcMotor backRight;

    /**
     * This function is executed when this Op Mode is selected.
     */
    @Override
    public void runOpMode() {
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backRight = hardwareMap.get(DcMotor.class, "backRight");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                // Put loop blocks here .
                frontLeft.setPower(gamepad1.left_stick_y);
                backLeft.setPower(gamepad1.left_stick_y);
                frontRight.setPower(-gamepad1.right_stick_y);
                backRight.setPower(-gamepad1.right_stick_y);
                telemetry.addData("Front Left Power:", frontLeft.getPower());
                telemetry.addData("Back Left Power", backLeft.getPower());
                telemetry.addData("Front Right Power", frontRight.getPower());
                telemetry.addData("Back Right Power", backRight.getPower());
                telemetry.update();
            }
        }
    }
}
