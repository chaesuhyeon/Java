import java.util.ArrayList;
import java.util.List;

class Product{}
class Tv extends Product {}
class Audio extends Product{}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
//        ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러
        List<Tv> tvList1 = new ArrayList<Tv>(); // 다형성 OK

        productList.add(new Tv());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productList);
    }

    public static void printAll(ArrayList<Product> list){
        for (Product p : list) {
            System.out.println(p);
        }
    }
}

//Tv@1b6d3586
//Audio@4554617c