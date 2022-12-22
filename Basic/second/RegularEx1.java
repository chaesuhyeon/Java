import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
        Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 단어
        for (int i = 0; i < data.length; i++) {
            Matcher m = p.matcher(data[i]); // 정규식 패턴을 데이터와 비교
            if(m.matches()){
                System.out.println(data[i] + ",");
            }
        }
    }
}
