package patterns.chainofresponsibility.app;

public class IntermediateLayer implements HelpInterface {
    final int INTERMEDIATE_LAYER_HELP = 2;
    HelpInterface successor;

    public IntermediateLayer(HelpInterface s) {
        this.successor = s;
    }

    @Override
    public void getHelp(int helpConstant) {
        if(helpConstant != INTERMEDIATE_LAYER_HELP) {
            successor.getHelp(helpConstant);
        } else {
            System.out.println("This is the intermeidate layer. Nice, eh?");
        }
    }
}
