package org.firstinspires.ftc.teamcode;

import android.os.SystemClock;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.sql.Time;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        ElapsedTime timer = new ElapsedTime();

        waitForStart();

        timer.reset();

        boolean wasPressed = false;
        while (opModeIsActive()) {
            boolean isPressed = gamepad1.a;
            if (isPressed && !wasPressed) {
                timer.reset();
            }

            double rounded = Math.round(timer.time() * 100.) / 100.;

            telemetry.addLine("seconds since button press: " + rounded);
            telemetry.update();
        }
    }
}
