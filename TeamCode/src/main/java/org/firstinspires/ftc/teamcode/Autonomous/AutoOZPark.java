package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Auto Observation Zone Park")
public class AutoOZPark {
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
            frontLeft.setPower(0.1);
            backLeft.setPower(0.1);
            frontRight.setPower(-0.1);
            backRight.setPower(-0.1);
            telemetry.addData("Front Left Power:", frontLeft.getPower());
            telemetry.addData("Back Left Power", backLeft.getPower());
            telemetry.addData("Front Right Power", frontRight.getPower());
            telemetry.addData("Back Right Power", backRight.getPower());
            telemetry.update();
        }
    }
}
