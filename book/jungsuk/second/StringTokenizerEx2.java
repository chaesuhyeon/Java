import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()",true); // true -> 구분자도 토큰으로 간주 / +-*/=()가 하나의 구분자가 아니라 각각의 문자가 모두 구분자
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

/*
x
=
100
*
(
200
+
300
)
/
2
*/
