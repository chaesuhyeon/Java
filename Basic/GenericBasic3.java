public class GenericBasic3<T, U> {
    private T first;
    private U second;

    public GenericBasic3(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        GenericBasic3<String, Integer> container = new GenericBasic3<>("Hello", 123);

        System.out.println("First: " + container.getFirst());
        System.out.println("Second: " + container.getSecond());

        // 값 변경
        container.setFirst("World");
        container.setSecond(456);

        System.out.println("First: " + container.getFirst());
        System.out.println("Second: " + container.getSecond());
    }
}
