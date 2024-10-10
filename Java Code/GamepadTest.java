package org.firstinspires.ftc.teamcode; // No changes needed here, package declaration is correct

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; 
import com.qualcomm.robotcore.hardware.Servo; // No changes needed here, import statement is correct
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor; 



@TeleOp(name = "Java GamepadTest", group = "Linear Opmode") // No changes needed here, annotation is correct

public class GamepadTest extends LinearOpMode {



    
    private Servo servo; // No change in declaration of the member variable.
    private DcMotor motor;
    double MotorPower;
    double ServoPos;

    @Override 
    public void runOpMode() throws InterruptedException{ // Changed return type to throw an exception for better error handling and removed unnecessary comments
        motor = hardwareMap.get(DcMotor.class, "motor0");
        servo = hardwareMap.get(Servo.class, "servo0");

        waitForStart();
        telemetry.addData("testing","test");
        telemetry.update();
        while (opModeIsActive()) { 
                ServoPos = gamepad1.right_stick_y;
                MotorPower = gamepad1.left_stick_y;
                servo.setPosition(ServoPos);
                motor.setPower(MotorPower);
                

            }
            
        }   
    }

