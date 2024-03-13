public class Ex6_14 {
    static {
        System.out.println("static { }"); // 클래스 초기화 블럭
    }

    {
        System.out.println("{ }"); // 인스턴스 초기화 블럭
    }

    public Ex6_14() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 b2 = new Ex6_14();

    }
}

// 멤버 변수는 초기화를 하지 않아도 자동적으로 변수의 자료형에 맞는 기본값으로 초기화가 이루어짐
// 지역변수는 사용하기 전에 반드시 초기화를 해야함
// 클래스 초기화 블럭이 가장 먼저 수행됨(처음 메모리에 로딩될 때 한번만 수행)


//static { }
//Ex6_14 bt = new Ex6_14();
//{ }
//생성자
//Ex6_14 bt2 = new Ex6_14();
//{ }
//생성자
