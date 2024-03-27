public class AnnotationBasic1 {
    static class MyClass {
        @MyAnnotation("This is my annotation")
        public void myMethod() {
            // 메서드 구현
        }
    }
    public static void main(String[] args) throws NoSuchMethodException {
        // MyClass 클래스의 myMethod 메서드에서 애노테이션 정보를 가져옴
        MyClass obj = new MyClass();
        java.lang.reflect.Method method = obj.getClass().getMethod("myMethod");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

        // 애노테이션의 값을 출력
        System.out.println(annotation.value());
    }
}
