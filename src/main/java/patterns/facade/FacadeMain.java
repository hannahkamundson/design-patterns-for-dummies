package patterns.facade;

import patterns.facade.product.SimpleProductFacade;

/**
 * The facade pattern lets you hide difficult implementation details that will be reused. They can then be hidden in a
 * separate class.
 */
public class FacadeMain {
    public static void run() {
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("printer");
        System.out.println("This product is a " + simpleProductFacade.getName());
    }
}
