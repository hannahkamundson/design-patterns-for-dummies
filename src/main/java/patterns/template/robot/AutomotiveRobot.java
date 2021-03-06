package patterns.template.robot;

public class AutomotiveRobot extends RobotTemplate {
    private String name;

    public AutomotiveRobot(String n) {
        this.name = n;
    }

    @Override
    public void getParts() {
        System.out.println("Getting a carburetor...");
    }

    @Override
    public void assemble() {
        System.out.println("Installing the carburetor...");
    }

    @Override
    public void test() {
        System.out.println("Revving the engine...");
    }

    public String getName() {
        return this.name;
    }
}
