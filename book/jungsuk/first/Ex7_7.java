public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();
        
        fe.water();
        car = fe; // car = (Car)fe ; 에서 형변환 생략

        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}

