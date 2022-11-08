import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i=0; set.size() < 6; i++){
            int num = (int)(Math.random()*45) +1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set); // LinkedList(Collection c) / HashSet에 저장된 객체들을 LinkedList에 담아서 처리
        Collections.sort(list);
        System.out.println(list);
    }
}
