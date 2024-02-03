package Chapter19;

import Chapter13.T;

import java.util.List;

public class Generics<T>{

    T thing;

    public Generics() {}

    public Generics(T thing) {
        this.thing = thing;
    }

    public T getT() {
        return thing;
    }

    public void setT(T t) {
        thing = t;
    }

    public static void print(List<?> list) {

        System.out.println(list);

    }

    public String toString() {
        return thing + "";
    }
}
