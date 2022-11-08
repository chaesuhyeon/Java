import java.util.Scanner;

public class Ex4_15 {
    // do - while문

    //do{
        // 조건식의 연산결과가 참일 때 수행될 문장들을 적음(처음 한번은 무조건 실행)
    //} while(조건식)

    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) +1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요 >");
            input = scanner.nextInt();
            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요");
            }
        } while (input != answer);
        System.out.println("정답입니다.");
    }
}
// input과 answer가 다른 동안 반복하다가 두 값이 같으면 반복을 벗어난다.
