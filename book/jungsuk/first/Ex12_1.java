import java.util.ArrayList;
import java.util.List;

class Product1{}
class Tv2 extends Product1{}
class Audio extends Product1{}
public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product1> productList = new ArrayList<Product1>();
        ArrayList<Tv2> tvList = new ArrayList<Tv2>();

//        ArrayList<Product1> tvList = new ArrayList<Tv2>();  // 에러
//        List<Tv> tvList = new ArrayList<Tv>(); // OK . 다형성

        productList.add(new Tv2());
        productList.add(new Audio());

        tvList.add(new Tv2());
        tvList.add(new Tv2());

        printAll(productList);
    }

    public static void printAll(ArrayList<Product1> list){
        for(Product1 p : list){
            System.out.println(p);
        }
    }
}
