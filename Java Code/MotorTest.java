package org.firstinspires.ftc.teamcode; // No changes needed here, package declaration is correct

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; 
import com.qualcomm.robotcore.hardware.Servo; // No changes needed here, import statement is correct
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor; 

@TeleOp(name = "Java Motor Test", group = "Linear Opmode") // No changes needed here, annotation is correct
public class MotorTest extends LinearOpMode {
    
    private DcMotor motor; // No change in declaration of the member variable.

    @Override 
    public void runOpMode() throws InterruptedException{ // Changed return type to throw an exception for better error handling and removed unnecessary comments
        motor = hardwareMap.get(DcMotor.class, "motor0");
        waitForStart();
        
        while (opModeIsActive()) { 
            motor.setPower(1);
            
        }   
    }
}
