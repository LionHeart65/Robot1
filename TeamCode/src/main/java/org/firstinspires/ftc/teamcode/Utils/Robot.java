package org.firstinspires.ftc.teamcode.Utils;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Robot {
    public DcMotor frontLeft;
    public DcMotor backLeft;
    public DcMotor frontRight;
    public DcMotor backRight;
    public Robot(HardwareMap hardwareMap) {
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
    }

    public void setMotors(Telemetry telemetry, double frontLeft, double backLeft, double frontRight, double backRight) {
        this.frontLeft.setPower(frontLeft);
        this.backLeft.setPower(backLeft);
        this.frontRight.setPower(frontRight);
        this.backRight.setPower(backRight);
        telemetry.addData("Front Left Power:", this.frontLeft.getPower());
        telemetry.addData("Back Left Power", this.backLeft.getPower());
        telemetry.addData("Front Right Power", this.frontRight.getPower());
        telemetry.addData("Back Right Power", this.backRight.getPower());
        telemetry.update();
    }
}
