package org.firstinspires.ftc.teamcode; // No changes needed here, package declaration is correct

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; 
import com.qualcomm.robotcore.hardware.Servo; // No changes needed here, import statement is correct
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor; 

@TeleOp(name = "Java TeleOp Test", group = "Linear Opmode") // No changes needed here, annotation is correct
public class ServoTest extends LinearOpMode {
    
    private Servo servo; // No change in declaration of the member variable.

    @Override 
    public void runOpMode() throws InterruptedException{ // Changed return type to throw an exception for better error handling and removed unnecessary comments
        servo = hardwareMap.get(Servo.class, "servo0");
        waitForStart();
        
        while (opModeIsActive()) { 
            int position = 0; // Initialized the variable 'position' to avoid NullPointerExceptions later in code execution
            
            for(int i=0;i<10;i++){  
                //Telemetry.addData("Position", String.valueOf(position)); // Changed data type from int to string, as addData expects a String argument 

                if(position == 0){  
                    position = 1;    
                } else {
                    position = 0;
                }  
                servo.setPosition(position);
                sleep(1000);
                
            }
            
        }   
    }
}
