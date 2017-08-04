package Algorithms;

/**
 * Created by RENT on 2017-08-04.
 */
public class OneWayList {
    OneWayListElement _head;
    int _counter;

    // DODAWANIE ELEMENTU NA POCZATKU I KONCU LICZBY

    public void addElementAtBeginning (int newElement){
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = _head;
        _head = p;
        _counter++;
    }
    
    public OneWayListElement getLastElement(){
        OneWayListElement iterator;
        iterator = _head;
        while(iterator.next != null){
            iterator=iterator.next;
        }
        return iterator;
    }

    public void addElementAtEnd(int newElement){
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        OneWayListElement lastOne = getLastElement();
        lastOne.next = p;
    }


    public void addElementAfter (int newElement, int elementAfter){
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        OneWayListElement iterator = new OneWayListElement();


    }
}
