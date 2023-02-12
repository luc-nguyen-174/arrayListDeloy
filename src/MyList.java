public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        if (size >= elements.length) {
            int newCapacity = elements.length + 1;
            E[] newElements = (E[]) (new Object[newCapacity]);
            for (int i = 0; i < size; i++) {
                newElements[i] = (E) elements[i];
            }
            elements = newElements;
        }
    }

    public void add(int index, E element) {
        ensureCapa();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements;
    }

    public E get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    public E clone() {
        E[] newElements = (E[]) (new Object[size]);
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = (E) elements[i];
        }
        return (E) newElements;
    }

//    public boolean contains(E o) {
//        for (int i = 0; i < size; i++) {
//            if ()
//        }
//    }
}
