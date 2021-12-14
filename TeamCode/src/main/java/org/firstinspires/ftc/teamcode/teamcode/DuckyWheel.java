package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class DuckyWheel {

    DcMotorEx duckMotor;

    Robot opMode;

    void init(Robot opMode) {
        this.opMode = opMode;

        duckMotor = opMode.hardwareMap.get(DcMotorEx.class, "ducky_wheel");
    }

    public void setPower(double power) {
        duckMotor.setPower(power);
    }


}
