package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

 
@Autonomous(name="Java: Drive Test", group="Linear OpMode")

public class DriveTest extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor rightBackDrive = null;

    @Override
    public void runOpMode() {


        leftFrontDrive  = hardwareMap.get(DcMotor.class, "MotorWhite");
        leftBackDrive  = hardwareMap.get(DcMotor.class, "MotorGrey");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "MotorRed");
        rightBackDrive = hardwareMap.get(DcMotor.class, "MotorBlue");



        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
         // sets to half power forward some are negative because some motors are backwards
            leftBackDrive.setPower(-0.5); 
            rightBackDrive.setPower(0.5);
            rightFrontDrive.setPower(-0.5);
            leftFrontDrive.setPower(-0.5);
            
            sleep(500);  // milliseconds 
          // stops motors by resetting power
            leftFrontDrive.setPower(0);
            leftBackDrive.setPower(0);
            rightFrontDrive.setPower(0);
            rightBackDrive.setPower(0);
        }
    }
}
    
