package patterns.builder.robot;

import java.util.ArrayList;
import java.util.Iterator;

public class CookieRobotBuildable implements RobotBuildable {
    ArrayList<Integer> actions;

    public void loadActions(ArrayList<Integer> a) {
        this.actions = a;
    }

    @Override
    public void go() {
        Iterator<Integer> itr = actions.iterator();

        while(itr.hasNext()) {
            switch (itr.next()) {
                case 1:
                    start();
                    break;
                case 2:
                    getParts();
                    break;
                case 3:
                    assemble();
                    break;
                case 4:
                    test();
                    break;
                case 5:
                    stop();
                    break;
            }
        }
    }

    public void start() {
        System.out.println("Starting...");
    }

    public void getParts() {
        System.out.println("Getting flour and sugar...");
    }

    public void assemble() {
        System.out.println("Baking a cookie...");
    }

    public void test() {
        System.out.println("Crunching a cookie...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }
}
