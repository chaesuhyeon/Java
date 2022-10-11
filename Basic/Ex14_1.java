@FunctionalInterface
interface MyFunction{
    void run();
}

public class Ex14_1 {
    static void excute(MyFunction f){ // 매개 변수의 타입이 MyFuction인 메서드
        f.run();
    }

    static MyFunction getMyfunction(){ // 반환 타입이 MyFuction인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        //람다식으로 MyFunction의  run을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyfunction();

        f1.run();
        f2.run();
        f3.run();

        excute(f1);
        excute(()-> System.out.println("run()"));
    }
}

//f1.run()
//f2.run()
//f3.run()
//f1.run()
//run()