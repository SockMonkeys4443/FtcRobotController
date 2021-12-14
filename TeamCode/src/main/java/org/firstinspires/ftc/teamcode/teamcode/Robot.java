package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

public abstract class Robot extends LinearOpMode {

    //Drive
    Drive drive = new Drive();

    //Brazo
    Brazo brazo = new Brazo();

    //Intake
    Intake intake = new Intake();

    //Ducky Wheel
    DuckyWheel duckyWheel = new DuckyWheel();

    //IMU
    IMUController imuController = new IMUController();

    //Timer
    public ElapsedTime runtime = new ElapsedTime(ElapsedTime.Resolution.SECONDS);
    Timer timer = new Timer(runtime);

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initializing Robot...");
        telemetry.update();

        drive.init(this);
        brazo.init(this);
        intake.init(this);
        duckyWheel.init(this);

        imuController.init(hardwareMap, telemetry);
        while(!imuController.imu.isGyroCalibrated() && !isStopRequested()) {
            sleep(50);
            idle();
        }
        telemetry.addData("IMU calib status", imuController.imu.getCalibrationStatus().toString());

        telemetry.addData("Status", "Initializing OpMode...");
        telemetry.update();

        robotInit();

        telemetry.addData("Status", "Initialization Complete!");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        drive.resetEncoder();

        while(opModeIsActive()) {
            robotRunning();
        }
    }

    public abstract void robotInit();
    public abstract void robotRunning();
}
