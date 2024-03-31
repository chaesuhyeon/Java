import java.util.*;

class GenericBasic2<T> {
    private List<T> list;

    public GenericBasic2() {
        list = new ArrayList<T>();
    }

    public void addAll(List<? extends T> elements) {
        list.addAll(elements);
    }

    public void printAll() {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GenericBasic2<Number> container = new GenericBasic2<>();
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);

        container.addAll(integers);
        container.addAll(doubles);

        container.printAll();
    }
}
