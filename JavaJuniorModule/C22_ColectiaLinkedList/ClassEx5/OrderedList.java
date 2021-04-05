package src.C22_ColectiaLinkedList.ClassEx5;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrderedList<T extends Comparable<T>> {

    private List<T> elements = new LinkedList<>();

    public boolean addInOrderedList(T newElement) {
        ListIterator<T> li = elements.listIterator();

        while (li.hasNext()) {
            int comparison = li.next().compareTo(newElement);

            if (comparison < 0) { // this element is smaller
                // will go to the next() element
            } else if (comparison > 0) { // found a bigger element
                // insertion should happen before it
                li.previous();
                li.add(newElement); // insert the element after the iterator
                return true;
            } else { // elements are equal => ignore the element
                return false;
            }
        }
        // if reach here => no greater element was found in the list
        //                  NOR the element is duplicated
        //   => should be inserted now, at the end
        li.add(newElement);
        return true;
    }

    @Override
    public String toString() {
        String ret = "";
        for(T el : elements) {
            ret += el + " ";
        }
        return ret;
    }
}

