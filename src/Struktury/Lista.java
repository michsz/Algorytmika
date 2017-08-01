package Struktury;

/**
 * Created by RENT on 2017-08-01.
 */
public class Lista {
    Element _head;
    Element _tail;
    int counter;

    public void goThroughListForward(Lista list){
        Element p = list._head;
        while (p.next != null){
            //logike wykonujemy
            p=p.next;
        }
    }

    public void  goThroughListBackward(Lista list){
        Element p = list._tail;
        while (p.prev != null){
            //wykonujemy logike
            p = p.prev;
        }

    }

    public void addElementAtBeginning (int newElement, Lista list){
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if(p.next != null){
            Element nextEl = p.next;
            nextEl.prev = p;
        }else {
            list._tail = p;
        }
     }

    public void addElementAtEnd (int newElement, Lista list){
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null){
            Element prevEl = p.prev;
            prevEl.next = p;
        } else {
            list._head = p;
        }
    }

    public Element getElementForward(int data, Lista list){
        Element p = list._head;
        while (p.next != null){
            if (p.data == data){
                break;
            }
            p = p.next;
        }

        return p;
    }

    public void displayDataForward(Lista list){
        Element p = list._head;
        while (p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }

    public Element getElementBackward(int data, Lista list){
        Element p = list._tail;
        while (p.prev != null){
            if (p.data == data){
                break;
            }
            p = p.prev;
        }

        return p;
    }


    public void addElementBeforeElement(int elementToAdd, int elementBefore, Lista list){
        Element before = list.getElementForward(elementBefore, list);
        if(before == list._head){
            list.addElementAtBeginning(elementToAdd, list);
        }
        else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list.counter++;
        }
    }

    public void addElementAterElement(int elementToAdd, int elementAfter, Lista list){
        Element after = list.getElementBackward(elementAfter, list);
        if(after == list._tail){
            list.addElementAtEnd(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.next = after.next;
            p.prev = after;
            Element nextAfter = after.next;
            nextAfter = p;

            after.next = p;
            list.counter++;
        }
    }

}
