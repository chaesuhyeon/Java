public class Ex8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        
        try {
            System.out.println(3);
            System.out.println(0/0); // 예외 발생
            System.out.println(4); // 실행되지 않음
        } catch (ArithmeticException ae) {
            ae.printStackTrace(); // 참조변수 ae를 통해 생성된 ArithmeticException 인스턴스에 접근 가능
            System.out.println("예외메시지 : " + ae.getMessage());
        } // try - catch  끝

        System.out.println(6);
    }
}

// 1
// 2
// 3

// java.lang.ArithmeticException: / by zero
//        at Ex8_5.main(Ex8_5.java:8)
// 예외메시지 : / by zero

// 6