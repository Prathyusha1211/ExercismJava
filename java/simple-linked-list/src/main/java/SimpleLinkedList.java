import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    T data;
    SimpleLinkedList<T> next;

    SimpleLinkedList() {
        this.next = null;
    }

    SimpleLinkedList(T[] values) {
        next = null;
        for(T value : values) {
            push(value);
        }
        //throw new UnsupportedOperationException("Please implement the SimpleLinkedList(T[]) constructor.");
    }

    void push(T value) {
        SimpleLinkedList<T> node = new SimpleLinkedList<>();
        node.data = value;
        if(next == null) {
            next = node;
            node.next = null;
        }
        else{
            node.next = this.next;
            this.next = node;
        }

        //throw new UnsupportedOperationException("Please implement the SimpleLinkedList.push() method.");
    }

    T pop() {
        if(next == null){
            throw new NoSuchElementException("List is empty");
        }
        T poppedValue = next.data;
        this.next = this.next.next;
        return poppedValue;

        //throw new UnsupportedOperationException("Please implement the SimpleLinkedList.pop() method.");
    }

    void reverse() {
        SimpleLinkedList<T> prev = null;
        SimpleLinkedList<T> next = null;
        SimpleLinkedList<T> current = this.next;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.next = prev;
        //throw new UnsupportedOperationException("Please implement the SimpleLinkedList.reverse() method.");
    }

    T[] asArray(Class<T> clazz) {
        List<T> arr = new ArrayList<>();
        SimpleLinkedList<T> node = next;
        while(node != null) {
            arr.add(node.data);
            node = node.next;
        }
        T[] result = (T[]) arr.toArray((T[]) java.lang.reflect.Array.newInstance(clazz, arr.size()));
        return result;
        //System.out.println();

        //throw new UnsupportedOperationException("Please implement the SimpleLinkedList.asArray() method.");

    }

    int size() {
        int count = 0;
        SimpleLinkedList<T> node = next;
        while(node != null) {
            count++;
            node = node.next;
        }
        return count;

        //throw new UnsupportedOperationException("Please implement the SimpleLinkedList.size() method.");
    }
}
