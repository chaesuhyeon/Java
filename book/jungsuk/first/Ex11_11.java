import java.util.HashSet;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person1("David", 10));
        set.add(new Person1("David", 10));
        System.out.println(set);
    }
}


class Person1{
    String name;
    int age;
    Person1(String name, int age){

        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + ":" + age;
    }
}
