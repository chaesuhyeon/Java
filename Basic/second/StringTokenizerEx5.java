import java.util.StringTokenizer;

public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data,","); // StringTokenizer는 빈 문자열을 토큰으로 인식하지 않음

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"|");
        }
        System.out.println("개수:" + result.length);

        int i = 0;
        for(;st.hasMoreTokens();i++){
            System.out.print(st.nextToken()+"|"); 
        }
        System.out.println("개수:" + i);
    }
}

/*
100|||200|300|개수:5
100|200|300|개수:3
*/
