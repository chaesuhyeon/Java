package casting;

// 오버플로우
public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver= 2147483648L; // int 최고값 + 1 (int 범위 초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue); // 2147483647

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue); // -2147483648 --> 범위가 넘어가면 오버 플로우가 발생해서 int의 가장 작은값부터 다시 시작함
    }
}
