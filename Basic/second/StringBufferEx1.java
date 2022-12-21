public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2)); // StringBuffer클래스는 equals 메서드를 오버라이딩 하지 않아서 equals메서드를 사용해도 등가비교 연산자(==)로 비교한 것과 같은 결과를 얻음

        //StringBuffer의 내용을 String으로 변환
        String s = sb.toString();
        String s2 = sb2.toString();
        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
