import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
                );

        //Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +" : 정규표현식으로 하나 이상의 공백을 의미 --> 문자열 line을 공백을 구분자로 사용하여 자른 문자열 배열
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}

/*
abc
def
ghi
jkl

believe
do
is
it
no
not
or
there
true
try
*/
