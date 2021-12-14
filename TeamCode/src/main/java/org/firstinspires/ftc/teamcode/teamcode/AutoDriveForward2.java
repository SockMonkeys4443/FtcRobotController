package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Drive Forward 3 Seconds", group = "working")
public class AutoDriveForward2 extends Robot {

    @Override
    public void robotInit() {

    }

    @Override
    public void robotRunning() {

        timer.restart();

        sleep(500);

        drive.setMotorPower(-0.5, -0.5, -0.5, -0.5);

        sleep(3000);

        drive.stop();

        stop();

    }


}
