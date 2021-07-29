package patterns.chainofresponsibility.app;

public class FrontEnd implements HelpInterface {
    final int FRONT_END_HELP = 1;
    HelpInterface successor;

    public FrontEnd(HelpInterface s) {
        this.successor = s;
    }

    @Override
    public void getHelp(int helpConstant) {
        if(helpConstant != FRONT_END_HELP) {
            successor.getHelp(helpConstant);
        } else {
            System.out.println("This is the front end. Dont you like it?");
        }
    }
}
