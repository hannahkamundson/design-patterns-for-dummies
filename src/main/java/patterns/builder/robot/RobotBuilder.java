package patterns.builder.robot;

public interface RobotBuilder {
    void addStart();
    void addGetParts();
    void addAssemble();
    void addTest();
    void addStop();
    RobotBuildable getRobot();
}
