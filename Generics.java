//https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        List<? extends Number> foo1 = new ArrayList<Number>(); // Number "extends" Number (in this context)
        List<? extends Number> foo2 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo3 = new ArrayList<Double>(); // Double extends Number

        List<? super Integer> foo4 = new ArrayList<Integer>(); // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo5 = new ArrayList<Number>(); // Number is a superclass of Integer
        List<? super Integer> foo6 = new ArrayList<Object>(); // Object is a superclass of Integer

    }
}
