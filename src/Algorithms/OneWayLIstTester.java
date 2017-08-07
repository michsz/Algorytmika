package Algorithms;

/**
 * Created by RENT on 2017-08-07.
 */
public class OneWayLIstTester extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "One way list tester";
    }

    @Override
    public void runAlgorithm(String[] input) {

        OneWayList lista = new OneWayList();

        lista.addElementAtBeginning(15);
        lista.addElementAtBeginning(30);
        lista.addElementAtBeginning(40);

        lista.deleteElement(30);

        lista.printAllElements();
    }
}
