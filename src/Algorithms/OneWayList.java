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
        OneWayListElement after = getElementForward(elementAfter);

        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = after.next;
        after.next = p;
        _counter++;


    }

    public void deleteElement (int elementToDelete){
        OneWayListElement toDelete = getElementForward(elementToDelete);

        if(toDelete == _head){
            _head = toDelete.next;
        }
        OneWayListElement iterator = _head;
        while (iterator.next != toDelete){
            iterator = iterator.next;
        }
        iterator.next = toDelete.next;
        toDelete = null;

        _counter--;
    }

    public OneWayListElement getElementForward(int data){
        OneWayListElement p = _head;

        while(p.next != null){
            if(p.data == data){
                break;
            }
            p = p.next;
        }
        return p;
    }

    public void printAllElements(){
        OneWayListElement p = _head;

        while (p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
}
