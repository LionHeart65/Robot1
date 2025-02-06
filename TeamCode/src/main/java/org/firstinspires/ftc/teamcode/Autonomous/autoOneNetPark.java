package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Auto Observation Zone Park")
public class autoOneNetPark extends LinearOpMode{

    private DcMotor frontLeft;
    private DcMotor backLeft;
    private DcMotor frontRight;
    private DcMotor backRight;

    /**
     * This function is executed when this Op Mode is selected.
     */

    // JUST WORK ALREADY
    @Override
    public void runOpMode() {
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backRight = hardwareMap.get(DcMotor.class, "backRight");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                frontLeft.setPower(0.5);
                backLeft.setPower(0.5);
                frontRight.setPower(-0.5);
                backRight.setPower(-0.5);
                telemetry.addData("Front Left Power:", frontLeft.getPower());
                telemetry.addData("Back Left Power", backLeft.getPower());
                telemetry.addData("Front Right Power", frontRight.getPower());
                telemetry.addData("Back Right Power", backRight.getPower());
                telemetry.update();
                sleep(5000);
                frontLeft.setPower(-0.5);
                backLeft.setPower(-0.5);
                frontRight.setPower(0.5);
                backRight.setPower(0.5);
                telemetry.addData("Front Left Power:", frontLeft.getPower());
                telemetry.addData("Back Left Power", backLeft.getPower());
                telemetry.addData("Front Right Power", frontRight.getPower());
                telemetry.addData("Back Right Power", backRight.getPower());
                telemetry.update();

            }
        }
    }
}
