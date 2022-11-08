import java.util.TreeSet;

public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from,to)); // 시작범위인 b는 포함이지만 d는 포함되지 않음 c로 시작하는 단어까지만 포함
        System.out.println("result2 : " + set.subSet(from,to+"zzz")); // 끝범위인 d로 시작하는 단어까지 포함시키고자 한다면 'zzz'와 같은 문자열을 붙이면 됨

    }
}

//[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower] -> 대문자가 소문자보다 우선
//range search : from b to d
//result1 : [bat, car]
//result2 : [bat, car, dZZZZ, dance, disc]