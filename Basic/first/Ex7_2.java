public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20; // this.x

    void method(){
        System.out.println("x= " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

// super : 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수 , 상속받은 멤버와 자식 멤버의  이름이 같을 때 super를 붙여서 구별
// this : 멤버변수와 지역 변수의 이름이 같을 때 사용

//x= 20
//this.x = 20
//super.x = 10