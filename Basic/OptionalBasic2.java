import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalBasic2 {
    public static void main(String[] args) {
        // 예제를 위한 데이터
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 1. 컬렉션에서 특정 요소 찾기
        Optional<String> foundName = names.stream()
                .filter(name -> name.startsWith("B"))
                .findFirst();
        foundName.ifPresent(name -> System.out.println("1. 찾은 이름: " + name));

        // 2. 찾은 요소가 없을 때 기본값 지정
        String defaultName = "NoName";
        String result2 = foundName.orElse(defaultName);
        System.out.println("2. 찾은 이름 또는 기본값: " + result2);

        // 3. 요소가 존재하지 않을 때 작업 수행
        foundName.orElseGet(() -> {
            System.out.println("3. 이름을 찾을 수 없습니다.");
            return defaultName;
        });

        // 4. 요소가 존재하지 않을 때 예외 던지기
        try {
            String result4 = foundName.orElseThrow(() -> new IllegalStateException("이름을 찾을 수 없습니다."));
            System.out.println("4. 찾은 이름: " + result4);
        } catch (IllegalStateException e) {
            System.out.println("4. 예외 발생: " + e.getMessage());
        }

        // 5. 값 변환
        Optional<Integer> nameLength = foundName.map(String::length);
        nameLength.ifPresent(length -> System.out.println("5. 이름 길이: " + length));

        // 6. 값이 존재할 때 추가 작업 수행
        foundName.ifPresent(name -> {
            String reversedName = new StringBuilder(name).reverse().toString();
            System.out.println("6. 이름 뒤집기: " + reversedName);
        });
    }
}
