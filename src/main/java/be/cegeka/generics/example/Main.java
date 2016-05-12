package be.cegeka.generics.example;

public class Main {

    public static void main(String[] args) {
        MyListWithoutGenerics myListWithoutGenerics = new MyListWithoutGenerics();
        myListWithoutGenerics.add("hallo");

        MyList<String> myList = new MyList<>();
        myList.add("Hallo generic list strings 1");
        myList.add("Hallo generic list strings 2");

        MyList<B> myList2 = new MyList<>();
        myList2.add(new B("Hallo generic list B 1"));
        myList2.add(new B("Hallo generic list B 2"));

        myListWithoutGenerics.print();
        myList.print();
        myList2.print();
    }


    public static class A {

    }

    public static class B extends A {

        private String name;

        public B(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public static class C extends B {

        public C(String name) {
            super(name);
        }
    }
}
