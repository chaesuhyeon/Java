import java.lang.reflect.Method;

public class ReflectionBasic {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Test1");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

class Test {
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }
}
