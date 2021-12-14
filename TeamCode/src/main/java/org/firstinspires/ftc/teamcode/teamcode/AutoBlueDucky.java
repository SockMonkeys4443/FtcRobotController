package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Blue Duck", group = "working")
public class AutoBlueDucky extends Robot {

    @Override
    public void robotInit() {

    }

    @Override
    public void robotRunning() {
        timer.restart();

        sleep(1000);

        drive.driveForward(0.3, 1.3f);

        sleep(500);

        duckyWheel.setPower(-0.65);

        sleep(5000);

        duckyWheel.setPower(0);

        sleep(3000);

        drive.driveForward(0.5, -106f);

        stop();
    }

}
