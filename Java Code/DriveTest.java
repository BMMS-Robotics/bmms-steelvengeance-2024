package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

 
@Autonomous(name="Java: Drive Test", group="Linear OpMode")

public class DriveTest extends LinearOpMode {

    // Declare OpMode members for each of the 4 motors.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor rightBackDrive = null;

    @Override
    public void runOpMode() {

        // Initialize the hardware variables. Note that the strings used here must correspond
        // to the names assigned during the robot configuration step on the DS or RC devices.
        leftFrontDrive  = hardwareMap.get(DcMotor.class, "MotorWhite");
        leftBackDrive  = hardwareMap.get(DcMotor.class, "MotorGrey");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "MotorRed");
        rightBackDrive = hardwareMap.get(DcMotor.class, "MotorBlue");



        // Wait for the game to start (driver presses START)
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            leftBackDrive.setPower(-0.5);
            rightBackDrive.setPower(0.5);
            rightFrontDrive.setPower(-0.5);
            leftFrontDrive.setPower(-0.5);
           // sleep(500);

            //leftFrontDrive.setPower(0);
            //leftBackDrive.setPower(0);
            //rightFrontDrive.setPower(0);
            //rightBackDrive.setPower(0);
        }
    }
}
    
