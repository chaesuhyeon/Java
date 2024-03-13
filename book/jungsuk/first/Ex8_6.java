public class Ex8_6 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e; // 예외를 발생시킴
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램이 정상 종료 되었음");
    }
}

//에러 메세지 : 고의로 발생시켰음
//프로그램이 정상 종료 되었음
//java.lang.Exception: 고의로 발생시켰음
//        at Ex8_6.main(Ex8_6.java:4)