package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Blue Warehouse", group = "working")
public class AutoBlueWarehouse extends Robot {

    @Override
    public void robotInit() {

    }

    @Override
    public void robotRunning() {
        timer.restart();

        sleep(1000);

        drive.driveForward(0.5, 18f);

        sleep(1000);

        drive.turnLeft(0.5, 90);

        sleep(1000);

        drive.driveForward(0.5, 48f);

        stop();
    }

}
