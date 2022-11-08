import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "11111");
        map.put("asdf", "1234"); // 이미 존재하는 키 추가 기능. 기존 값은 없어짐

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id : ");
            String id = s.nextLine().trim();

            System.out.print("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){ // containsKey(Object key)지정된 key가 포함되어있는지 알려줌 . boolean
                System.out.println("입력하신 id는 존재하지 않습니다." + " 다시 입력해주세요");
                continue;
            } else {
                if (!(map.get(id)).equals(password)){ // get(Object key) : 지정된 key의 값을 반환
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
        }

    }
}
