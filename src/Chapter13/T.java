package Chapter13;

import java.util.*;

public class T implements Interface{

    public static void main(String[] args) {

       Interface a = new T();
       a.instanceMethod1();
       a.instanceMethod2();
       a.defaultMethod();
       Interface.staticMethod();

       T b = new T();
       b.instanceMethod1();
       b.instanceMethod2();
       b.defaultMethod();


    }

    @Override
    public void instanceMethod1() {
        System.out.println("Class: instance method1");
    }

    @Override
    public void instanceMethod2() {
        System.out.println("Class: instance method2");
    }
}
interface Interface {

    int INT_CONSTANT = 0; // it's a constant, the same as public static final int INT_CONSTANT = 0

    void instanceMethod1();

    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method. It can be overridden");
    }

    private void privateMethod() {
        System.out.println("Interface: private methods in interfaces are acceptable but should have a body");
    }
}