public class Ex6_15 {
    static int[] arr = new int[10];

    static {
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10) +1;
        }
    }

    public static void main(String[] args) {
        for(int i = 0 ; i < arr.length; i++) {
            System.out.println("arr[" +i + "] :" + arr[i]);
        }
    }
}
// 명시적 초기화를 통해 arr 배열을 생성
// 클래스 초기화 블럭을 이용해서 배열의 각 요소들을 채움
