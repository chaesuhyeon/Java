public class Ex2_12 {
    public static void main(String[] args) {
        String str ="3";

        System.out.println(str.charAt(0)-'0'); // int 3
        System.out.println('3'-'0' + 1); // int 4
        System.out.println(Integer.parseInt("3") + 1); // int 4
        System.out.println("3" + 1); // string 31
        System.out.println((char) (3 + '0')); // string 3
    }
}
