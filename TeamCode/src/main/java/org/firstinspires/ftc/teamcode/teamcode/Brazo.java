package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class Brazo {

    DcMotor brazoMotor;

    Servo scoop;
    Servo claw;

    Robot opMode;

    void init(Robot opMode) {
        this.opMode = opMode;

        brazoMotor = opMode.hardwareMap.get(DcMotor.class, "brazo");
        scoop = opMode.hardwareMap.get(Servo.class, "scoop");
        claw = opMode.hardwareMap.get(Servo.class, "claw");

        brazoMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        brazoMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    public void setPower(double power) {
        brazoMotor.setPower(power);
    }

    public void setScoopPosition(double value) {
        scoop.setPosition(value);
    }

    public void setClawPosition(double value) {
        claw.setPosition(value);
    }

}
