package patterns.builder.robot;

import java.util.ArrayList;

public class CookieRobotBuilder implements RobotBuilder {
    CookieRobotBuildable robot;
    ArrayList<Integer> actions;

    public CookieRobotBuilder() {
        this.robot = new CookieRobotBuildable();
        this.actions = new ArrayList<Integer>();

    }

    @Override
    public void addStart() {
        this.actions.add(1);
    }

    @Override
    public void addGetParts() {
        this.actions.add(2);
    }

    @Override
    public void addAssemble() {
        this.actions.add(3);
    }

    @Override
    public void addTest() {
        this.actions.add(4);
    }

    @Override
    public void addStop() {
        this.actions.add(5);
    }

    @Override
    public RobotBuildable getRobot() {
        this.robot.loadActions(actions);
        return robot;
    }
}
