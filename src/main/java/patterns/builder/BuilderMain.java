package patterns.builder;

import patterns.builder.robot.CookieRobotBuilder;
import patterns.builder.robot.RobotBuildable;
import patterns.builder.robot.RobotBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuilderMain {

    public static void run() {
        RobotBuilder builder;
        RobotBuildable robot;
        String response = "c";

        System.out.print("Do you want a cookie robot [c] or an automotive one [a]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            response = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error");
        }

        if (response.equals("c")) {
            builder = new CookieRobotBuilder();
            builder.addStart();
            builder.addTest();
            builder.addAssemble();
            builder.addStop();

            robot = builder.getRobot();

            robot.go();
        } else {
            System.err.println("Not yet implemented");
        }
    }
}
