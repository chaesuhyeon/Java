package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); // double을 int형에 대입하므로 컴파일 에러
        printNumber((int) number); // 명시적 형변환을 사용해 컴파일 에러 해결
    }
    public static void printNumber(int n) {
        System.out.println("숫자 = " + n);
    }
}
