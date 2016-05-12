package be.cegeka.generics.example;

public class MyListWithoutGenerics {

    private static final int INITIAL_CAPACITY = 10;
    private static final int INCREMENT_CAPACITY = 5;

    private int nrOfElementsInList;
    private String data[];

    public  MyListWithoutGenerics() {
        data = new String[INITIAL_CAPACITY];
        nrOfElementsInList = 0;
    }

    public void add(String element) {
        if (isListFull()) {
            copyDataIntoLargerArray();
        }

        data[nrOfElementsInList] = element;
        nrOfElementsInList++;
    }

    public String getAtIndex(int i) {
        if (i >= nrOfElementsInList) {
            throw new IndexOutOfBoundsException();
        }

        return data[i];
    }

    public void print() {
        for (String string : data ) {
            System.out.println(string);
        }
    }

    private boolean isListFull() {
        return nrOfElementsInList >= data.length;
    }

    private void copyDataIntoLargerArray() {
        String[] copy = new String[data.length + INCREMENT_CAPACITY];
        for (int i = 0; i < data.length; ++i) {
            copy[i] = data[i];
        }
        data = copy;
    }

}
