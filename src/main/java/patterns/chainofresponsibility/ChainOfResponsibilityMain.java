package patterns.chainofresponsibility;

import patterns.chainofresponsibility.app.Application;
import patterns.chainofresponsibility.app.FrontEnd;
import patterns.chainofresponsibility.app.IntermediateLayer;

/**
 * Chain of responsibility pattern is used when you want to handle notifications in a loosely coupled way but you want
 * a definite chain of command. This prevents you from having to put everything in one class.
 */
public class ChainOfResponsibilityMain {
    public static void run() {
        final int FRONT_END_HELP = 1;
        final int INTERMEDIATE_LAYER_HELP = 2;
        final int GENERAL_HELP = 3;

        Application app = new Application();
        IntermediateLayer intermediateLayer = new IntermediateLayer(app);
        FrontEnd frontEnd = new FrontEnd(intermediateLayer);
        frontEnd.getHelp(GENERAL_HELP);
        frontEnd.getHelp(INTERMEDIATE_LAYER_HELP);
        frontEnd.getHelp(FRONT_END_HELP);
    }
}
