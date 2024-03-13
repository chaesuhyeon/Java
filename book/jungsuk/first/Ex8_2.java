public class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        
        try {
            System.out.println(0/0);
            System.out.println(2); // 오류 발생으로 실행되지 않음
        } catch (ArithmeticException ae) {
            System.out.println(3);
        } // try - catch 끝

        System.out.println(4);
    }
}
//1
//3
//4