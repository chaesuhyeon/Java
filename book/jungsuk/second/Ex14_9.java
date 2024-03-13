import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream", "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);
        
        // noneMatch 모든 요소가 불일치하면 참
        boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0); // 모든 요소가 길이가 0이 아니기 때문에 모두 불일치 -> noneMatch = true
        Optional<String> sWord = Stream.of(strArr).filter(s->s.charAt(0)=='s').findFirst(); // 첫 번째 글자가 s인 것중에서 첫번째 단어 반환

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord = " + sWord.get());

        //Stream<String[]>을 IntStream으로 변환

        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        // reduce(초기값, 어떤 연산으로 스트림 요소를 줄여자날 것인지)
        int count = intStream1.reduce(0, (a,b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max.getAsInt());
        System.out.println("min = " + min.getAsInt());


    }
}

/*
Inheritance
Java
Lambda
stream
OptionalDouble
IntStream
count
sum
noEmptyStr = true
sWord = stream
count = 8
sum = 58
max = 14
min = 3
*/
