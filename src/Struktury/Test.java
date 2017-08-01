package Struktury;

/**
 * Created by RENT on 2017-08-01.
 */
public class Test {
    public static void main(String[] args) {

        Lista list = new Lista();

        list.addElementAtBeginning(1, list);
        list.addElementAtBeginning(123, list);
        list.addElementAtBeginning(456, list);
        list.addElementAtBeginning(789, list);
        list.addElementAtEnd(2, list);
        list.addElementBeforeElement(3, 123, list);

        list.displayDataForward(list);

    }
}
