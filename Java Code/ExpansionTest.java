package org.firstinspires.ftc.teamcode; // No changes needed here, package declaration is correct

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; 
import com.qualcomm.robotcore.hardware.Servo; // No changes needed here, import statement is correct
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor; 

@TeleOp(name = "Java Expansion hub test", group = "Linear Opmode") // No changes needed here, annotation is correct
public class ExpansionTest extends LinearOpMode {
    
    private Servo servo; // No change in declaration of the member variable.
    private DcMotor motor;
    
    @Override 
    public void runOpMode() throws InterruptedException{ // Changed return type to throw an exception for better error handling and removed unnecessary comments
        servo = hardwareMap.get(Servo.class, "servo5");

        waitForStart();
        
        while (opModeIsActive()) { 
            servo.setPosition(1.00);
            
            
        }   
    }
}
