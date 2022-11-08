public class Ex9_11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));


        //StringBuffer의 내용을 String으로 변환
        String s = sb.toString();
        String s2 = sb.toString();

        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}

// sb == sb2 ? false
// sb.equals(sb2) ? false
// s.equals(s2) ? true