import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class GenericQueue<T> {
    private List<T> queue;

    public GenericQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        GenericQueue<Integer> integerQueue = new GenericQueue<>();
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        System.out.println("Peek: " + integerQueue.peek()); // Output: 10
        System.out.println("Dequeue: " + integerQueue.dequeue()); // Output: 10
        System.out.println("Peek: " + integerQueue.peek()); // Output: 20
    }
}
