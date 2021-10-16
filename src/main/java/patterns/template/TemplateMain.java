package patterns.template;

import patterns.template.robot.AutomotiveRobot;
import patterns.template.robot.CookieRobot;

public class TemplateMain {
    public static void run() {
        AutomotiveRobot automotive = new AutomotiveRobot("Automotive robot");
        CookieRobot cookie = new CookieRobot("Cookie robot");

        System.out.println(automotive.getName() + ":");
        automotive.go();

        System.out.println(cookie.getName() + ":");
        cookie.go();
    }
}
