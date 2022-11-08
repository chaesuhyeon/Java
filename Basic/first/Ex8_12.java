public class Ex8_12 {
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception e){
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        }
    }

    static void method1() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e){
            System.out.println("method1메서드에서 예외를 처리했습니다.");
            throw e; // 다시 예외를 발생시킴
        }
    }
}



//method1메서드에서 예외를 처리했습니다.
//main 메서드에서 예외가 처리되었습니다.

// method1()의 catch블럭에서 예외를 처리하고도 throw문을 통해 다시 예외를 발생시킴. 그리고 이 예외를 main메서드에서 한 번 더 처리