public class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println(" mm.add(3,3) 결과 : " + mm.add(3,3));
        System.out.println(" mm.add(3L,3) 결과 : " + mm.add(3L,3));
        System.out.println(" mm.add(3,3L) 결과 : " + mm.add(3,3L));
        System.out.println(" mm.add(3L,3L) 결과 : " + mm.add(3L,3L));
        int[] a = {100, 200, 300};
        System.out.println(" mm.add(a) 결과 : " + mm.add(a));
    }
}


class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a , int b) -");
        return a + b;
    }
    long add(int a, long b){
        System.out.print("int add(int a , long b) -");
        return a+b;
    }
    long add(long a, int b){
        System.out.print("int add(long a , int b) -");
        return a+b;
    }
    long add(long a, long b){
        System.out.print("int add(long a , long b) -");
        return  a+b;
    }
    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int i = 0; i <a.length; i++)
            result += a[i];
        return result;
        }
}
// 매개변수의 개수 또는 타입이 다르면 같은 이름을 사용해서 메서드를 정의할 수 있다.
// 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 오버로딩이라고 함
// 매서드 이름이 같아야 함
// 매개변수의 개수 또는 타입이 달라야 함


//int add(int a , int b) - mm.add(3,3) 결과 : 6
//int add(long a , int b) - mm.add(3L,3) 결과 : 6
//int add(int a , long b) - mm.add(3,3L) 결과 : 6
//int add(long a , long b) - mm.add(3L,3L) 결과 : 6
//int add(int[] a) -  mm.add(a) 결과 : 600

