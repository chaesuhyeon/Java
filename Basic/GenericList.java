import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> list;

    public GenericList() {
        list = new ArrayList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        GenericList<Integer> integerList = new GenericList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println("Size of integerList: " + integerList.size());
        System.out.println("Element at index 1: " + integerList.get(1));

        GenericList<String> stringList = new GenericList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        System.out.println("Size of stringList: " + stringList.size());
        System.out.println("Element at index 2: " + stringList.get(2));
    }
}
