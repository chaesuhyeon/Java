import java.util.Optional;

public class OptionalBasic1 {
    public static void main(String[] args) {
        // 예제를 위한 데이터
        String someString = "Hello, Optional!";

        // 1. 기본 값 설정
        Optional<String> optionalString = Optional.ofNullable(someString);
        String result1 = optionalString.orElse("기본값");
        System.out.println("1. 기본 값 설정: " + result1);

        // 2. 값이 존재하는 경우에만 작업 수행
        optionalString.ifPresent(value -> System.out.println("2. 값이 존재합니다: " + value));

        // 3. 값이 존재할 때 작업 수행
        String result3 = optionalString.map(value -> "변형된 값: " + value).orElse("값이 존재하지 않습니다.");
        System.out.println("3. 값이 존재할 때 작업 수행: " + result3);

        // 4. 값이 존재하지 않을 때 예외 던지기
        try {
            String result4 = optionalString.orElseThrow(() -> new IllegalArgumentException("값이 존재하지 않습니다."));
            System.out.println("4. 값이 존재할 때 예외 던지기: " + result4);
        } catch (IllegalArgumentException e) {
            System.out.println("4. 값이 존재하지 않을 때 예외 던지기: " + e.getMessage());
        }

        // 5. 필터링
        optionalString.filter(value -> value.length() > 5)
                .ifPresent(filteredValue -> System.out.println("5. 길이가 5 이상인 값: " + filteredValue));

        // 6. 값 추출
        String result6 = optionalString.orElseThrow(() -> new IllegalStateException("값이 존재하지 않습니다."));
        System.out.println("6. 값 추출: " + result6);

        // 7. 값 변환
        Optional<Integer> optionalLength = optionalString.map(String::length);
        optionalLength.ifPresent(length -> System.out.println("7. 문자열 길이: " + length));

        // 8. 값 비교
        Optional<String> optionalString2 = Optional.ofNullable("Another String");
        boolean isEqual = optionalString.equals(optionalString2);
        System.out.println("8. 값 비교: " + isEqual);
    }
}
