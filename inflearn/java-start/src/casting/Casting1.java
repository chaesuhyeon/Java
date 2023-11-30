package casting;

// 작은 범위에서 큰 범위에 값을 대입하는 코드는 문제 없다
// 자동 형변환
public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
    
}
