import java.util.*;

class GenericBasic1<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericBasic1<Integer> integerBox = new GenericBasic1<>();
        GenericBasic1<String> stringBox = new GenericBasic1<>();

        integerBox.set(10);
        stringBox.set("Hello World");

        System.out.println("Integer Value: " + integerBox.get());
        System.out.println("String Value: " + stringBox.get());
    }
}
