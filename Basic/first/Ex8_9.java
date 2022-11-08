public class Ex8_9 {
    public static void main(String[] args) {
//        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}

// method2()는 종료되면서 자신을 호출한 method1에 예외를 넘겨준다.method1에서 예외 처리를 하지 않았기 때문에 method1도 자신을 호출한 main메서드에 예외를 넘겨준다.
// 그러나 main메서드에서 조차 예외 처리를 해주지 않았기 때문에 비정상적으로 종료
