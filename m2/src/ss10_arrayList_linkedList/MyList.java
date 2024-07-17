package ss10_arrayList_linkedList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E e, int index) {
        ensureCapacity(index);
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        if (index > elements.length - 1 || index < 0) {
            throw new IndexOutOfBoundsException("không tìm thấy");

        }
        E e = (E) elements[index];

        if (container(e)) {
            elements[index] = null;
            size--;
            return e;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean container(E e) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= elements.length) {
            int newCapacity = elements.length * 2;
            elements = new Object[newCapacity];
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }

}
