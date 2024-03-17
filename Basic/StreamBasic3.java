import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic3 {
    public static void main(String[] args) {

        // 문자 => 숫자
        String[] str = {"1", "2", "3", "4", "5"};

        int sum = Arrays.stream(str)
                .mapToInt((s)-> Integer.parseInt(s))
                .sum();

        int sumLambda = Arrays.stream(str)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("SUM : " + sum);
        System.out.println("SUM : " + sumLambda);
        // ================================================ //

        // 숫자 => 문자
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = numbers.stream()
                .map(Object::toString)
                .toList();

        System.out.println("String list : " + strings);
        // ================================================ //

    }
}
