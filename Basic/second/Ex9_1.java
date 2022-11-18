public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)){
            System.out.println("v1과 v2는 같습니다.");
        } else
            System.out.println("v1과 v2는 다릅니다.");
    }
}

class Value {
    int value ;

    public Value(int value) {
        this.value = value;
    }
}
//v1과 v2는 다릅니다.
//equals 메서드는 주소값으로 비교하기 때문에 두 Value 인스턴스의 멤버변수 value 값이 10으로 서로 같은지라도 equals 메서드로 비교한 결과는 false 임