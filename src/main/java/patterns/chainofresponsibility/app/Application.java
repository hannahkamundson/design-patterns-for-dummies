package patterns.chainofresponsibility.app;

public class Application implements HelpInterface {
     public void getHelp(int helpConstant) {
         System.out.println("This is the MegaGigaCo application.");
     }
}
