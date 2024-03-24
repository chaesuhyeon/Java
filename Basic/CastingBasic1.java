public class CastingBasic1 {
    public static void main(String[] args) {
        // 정수형에서 실수형으로 형변환
        int intValue = 10;
        double doubleValue = (double) intValue;
        System.out.println("doubleValue = " + doubleValue);


        // 실수형에서 정수형으로 형변환
        double doubleValue1 = 10.5;
        int intValue1 = (int) doubleValue1;
        System.out.println("intValue1 = " + intValue1);

        // 문자형에서 정수형으로 형변환
        char charValue2 = 'A';
        int intValue2 = (int) charValue2;
        System.out.println("intValue2 = " + intValue2);

        // 정수형에서 문자형으로 형변환
        int intValue3 = 65;
        char charValue3 = (char) intValue3;
        System.out.println("charValue3 = " + charValue3);
    }
}
