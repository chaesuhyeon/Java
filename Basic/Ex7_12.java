public class Ex7_12 {
    class InstanceInner{
        int iv = 100;
        //static int cv = 100; // 에러. static변수 선언 안됨
        final static int CONST = 100; // final static은 상수이므로 허용
    }
    
     static class StaticInner {
        int iv = 200;
        static int cv = 200; // static 클래스만 static 멤버를 정의할 수 있음
     }
     
     void myMethod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300; // static변수 선언 안됨
            final static int CONST = 300; // final static은 상수이므로 허용
        }
     }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}

// 내부 클래스 중에서 스태틱 클래스만 static 멤버를 가질 수 있다. 내부 클래스에 static 변수를 선언해야 한다면, static 클래스로 선언해야 한다.
// 다만 final과 static이 동시에 붙은 변수는 상수(constant)이므로 모든 내부 클래스에서 정의가 가능하다.