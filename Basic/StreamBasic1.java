import java.util.Arrays;
import java.util.List;

public class StreamBasic1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과", "복숭아", "딸기");
        list.stream().forEach(System.out::println);
    }
}
