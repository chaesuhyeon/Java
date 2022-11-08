public class Ex5_6 {
    public static void main(String[] args) {
        String[] names = {"kim", "park", "yi"};

        for(int i=0; i<names.length;i++)
            System.out.println("names[" + i + "] : " +names[i]);

        String tmp = names[2]; // 배열 naems의 세 번째 요소를 tmp에 저장
        System.out.println("tmp : " + tmp); // yi
        names[0] = "yu"; // 배열 names의 첫 번째 요소를 "yu"로 변경

        for(int i=0; i<names.length;i++)
            System.out.println(names[i]); // yu, park , yi
    }
}