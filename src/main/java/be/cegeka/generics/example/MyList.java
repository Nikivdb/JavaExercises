package be.cegeka.generics.example;

import java.lang.reflect.ParameterizedType;

public class MyList<T> {

    private static final int INITIAL_CAPACITY = 10;
    private static final int INCREMENT_CAPACITY = 5;


    private int nrOfElementsInList;
    private Object data[];

    public  MyList() {
        data = new Object[INITIAL_CAPACITY];
        nrOfElementsInList = 0;
    }

    public void add(T element) {
        if (isListFull()) {
            copyDataIntoLargerArray();
        }

        data[nrOfElementsInList] = element;
        nrOfElementsInList++;
    }

    public T getAtIndex(int i) {
        if (i >= nrOfElementsInList) {
            throw new IndexOutOfBoundsException();
        }

        return (T) data[i];
    }

    public void print() {
        for (Object object : data ) {
            System.out.println(object);
        }
    }
    
    private boolean isListFull() {
        return nrOfElementsInList >= data.length;
    }

    private void copyDataIntoLargerArray() {
        Object[] copy = new Object[data.length + INCREMENT_CAPACITY];
        for (int i = 0; i < data.length; ++i) {
            copy[i] = data[i];
        }
        data = copy;
    }
}
