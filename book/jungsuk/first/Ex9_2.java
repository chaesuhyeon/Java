public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1.equals(p2)){
            System.out.println("p1은 p2와 같은 사람입니다.");
        } else {
            System.out.println("p1은 p2와 다른 사람입니다.");
        }
    }
}

class Person {
    long id;
    public boolean equals(Object obj){
        if(obj instanceof Person){
            return id ==((Person)obj).id;
        } else {
            return false; //타입이 Person이 아니면 비교할 필요가 없음
        }
    }

    Person(long id) {
        this.id = id;
    }
}

// p1은 p2와 같은 사람입니다.
// equals 메서드를 오버라이딩 해서 주소가 아닌 객체에 저장된 내용을 비교하도록 함

