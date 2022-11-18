public class Ex9_2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1(8011081111222L);
        Person1 p2 = new Person1(8011081111222L);

        if(p1.equals(p2)){
            System.out.println("p1과 p2는 같은 사람입니다.");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}

class Person1 {
    long id;

    public boolean equals(Object obj){
        if(obj instanceof Person1){
            return id == ((Person1)obj).id;
        } else {
            return false;
        }
    }

    Person1(long id){
        this.id = id;
    }
}
//p1과 p2는 같은 사람입니다.
//equals 메서드가 Person인스턴스의 주소값이 아닌 멤버변수 id의 값을 비교하도록 하기 위해 equals 메서드를 오버라이딩
//이렇게 하면 서로 다른 인스턴스일지라도 같은 id를 가지고 있다면 equals 메서드로 비교했을 때 true를 결과로 얻게할 수 있다.