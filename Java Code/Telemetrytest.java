package org.firstinspires.ftc.teamcode; // No changes needed here, package declaration is correct

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; 
import com.qualcomm.robotcore.hardware.Servo; // No changes needed here, import statement is correct
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor; 



@TeleOp(name = "Java Telemetry Test", group = "Linear Opmode") // No changes needed here, annotation is correct

public class Telemetrytest extends LinearOpMode {



    
    private DcMotor motor;
    double MotorPower;
    double Rotations = 0.0;

    @Override 
    public void runOpMode() throws InterruptedException{ // Changed return type to throw an exception for better error handling and removed unnecessary comments
        motor = hardwareMap.get(DcMotor.class, "motor0");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        
        waitForStart();

        while (opModeIsActive()) { 
                MotorPower = gamepad1.left_stick_y; // shows that MotorPower variable is set to gamepad1 left sticks vertical(y) position
                motor.setPower(MotorPower);
                Rotations = motor.getCurrentPosition();
                telemetry.addData("Motor Rotation",String.valueOf(Rotations)); // tells operator that Motor Rotation gets current position of the motor
                telemetry.update();

            }
            
        }   
    }

