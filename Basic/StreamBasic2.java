import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic2 {

    public static void main(String[] args) {
        // 정수 리스트 생성
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 필터링하여 새로운 리스트 생성
        List<Integer> evenNumbers = numbers.stream()
                                        .filter(n-> n%2 == 0)
                                        .toList();

        // 각 요소를 제곱하고 짝수만 필터링하여 짝수를 구함
        int sum = numbers.stream()
                        .map(n -> n * n)
                        .filter(n -> n % 2 == 0)
                        .reduce(0, Integer::sum); // reduce : 스트림의 요소들을 하나의 결과 값으로 결합하는데 사용됨 / 0은 초기값


        System.out.println(evenNumbers);
        System.out.println(sum);


    }
}
