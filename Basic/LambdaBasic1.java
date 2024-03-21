import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaBasic1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // 람다 표현식 사용
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println(names);


        // 두 개의 정수를 더하는 BinaryOperator 인터페이스를 람다로 구현
        BinaryOperator<Integer> adder = (a, b) -> a + b;

        int sum = adder.apply(3, 5); // 결과: 8
        System.out.println("합계: " + sum);
    }
}
