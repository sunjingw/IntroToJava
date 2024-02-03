package Chapter19;

import Chapter13.T;

import java.util.*;

public class TestGenerics {
    public static void main(String[] args) {

        Generics<Integer> integer = new Generics<>(12);
        //Generics<Dobule> str = new Generics<>("string");
        Generics<Double> dou = new Generics<>(12.12);

        Generics<Number> a = new Generics<>();

        Generics<T> t = new Generics<>();

        List<Integer> l = new ArrayList<>();
        l.add(33);
        List<Double> d = new ArrayList<>();
        d.add(11.1);

        //Generics.print(l);
        //Generics.print(d);

        //print(t);
        print(integer);
        print(dou);

    }

    public static void print(Generics<?> g) {

        System.out.println(g);

    }
}
