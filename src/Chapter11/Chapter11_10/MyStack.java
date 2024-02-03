package Chapter11.Chapter11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    private ArrayList<Object> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(Object o) {
        stack.add(0, o);
    }
    public Object pop() {
        Object o = stack.get(0);
        stack.remove(0);
        return o;
    }

}
