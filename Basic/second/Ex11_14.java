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

        System.out.println(set); // [Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
        System.out.println("range search: from " + from + " to " + to); // range search: from b to d
        System.out.println("result1 : " + set.subSet(from,to)); // 끝 범위는 포함되지 않으므로 d가 포함 x 따라서 b ~ c 까지  , result1 : [bat, car]
        System.out.println("result2 : " + set.subSet(from,to+"zzz")); // result2 : [bat, car, dZZZZ, dance, disc] -> 끝범위인 d까지 포함시키고 싶을 때



    }
}
