import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        GenericStack<Integer> integerStack = new GenericStack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        System.out.println("Peek: " + integerStack.peek()); // Output: 30
        System.out.println("Pop: " + integerStack.pop());   // Output: 30
        System.out.println("Peek: " + integerStack.peek()); // Output: 20
    }
}
