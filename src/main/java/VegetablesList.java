import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
class VegetablesList implements MyList<Vegetables> {

    private Node<Vegetables> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public VegetablesList() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(Vegetables element) {
        Node<Vegetables> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<Vegetables> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public Vegetables get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Недійсний індекс");
        }
        Node<Vegetables> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public Iterator<Vegetables> iterator() {
        return new VegetablesListIterator();
    }

    private class VegetablesListIterator implements Iterator<Vegetables> {
        private Node<Vegetables> current = head;
        private Node<Vegetables> previous = null;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Vegetables next() {
            if (!hasNext()) {
                throw new IllegalStateException("Немає елементів для перегляду");
            }
            Vegetables data = current.data;
            previous = current;
            current = current.next;
            return data;
        }

        @Override
        public void remove() {
            if (previous == null) {
                throw new IllegalStateException("remove() може бути викликаний після виклику next()");
            }
            if (previous == head) {
                head = head.next;
            } else {
                previous.next = current;
            }
            size--;
            previous = null;
        }
    }
}
