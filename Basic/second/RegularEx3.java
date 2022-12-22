import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
    public static void main(String[] args) {
        String source = "HP:011-1111-1111,HOME:02-999-9999 ";
        String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})"; // 0으로 시작하는 최소 2자리 최대 3자리 숫자(0포함) / 최소 3자리 최대 4자리 숫자 / 4자리 숫자

        Pattern p= Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        int i=0;
        while (m.find()){ // find()는 일치하는 패턴이 있으면 true, 없으면 false를 반환
            System.out.println(++i + ": " + m.group() + " -> " + m.group(1) + ", " + m.group(2)+ ", " + m.group(3));
        }
    }
}

//1: 011-1111-1111 -> 011, 1111, 1111
//2: 02-999-9999 -> 02, 999, 9999