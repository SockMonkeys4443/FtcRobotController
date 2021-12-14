package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Drive Forward 5 Seconds", group = "working")
public class AutoDriveForward extends Robot {

    @Override
    public void robotInit() {

    }

    @Override
    public void robotRunning() {

        timer.restart();

        sleep(10000);

        drive.setMotorPower(-0.5, -0.5, -0.5, -0.5);

        sleep(5000);

        drive.stop();

        stop();

    }


}
