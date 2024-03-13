public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]=(int)(Math.random()*10));
        }
        System.out.println();
        for (int i = 0; i < numArr.length-1; i++) {
            boolean changed = false; // 자리바꿈이 발생했는지를 체크
            for (int j = 0; j < numArr.length-1-i; j++) {
                if(numArr[j] > numArr[j+1]){ //옆의 값이 작으면 서로 바꾼다.
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true; // 자리 바꿈이 발생했으니 changed true로
            }
        }
            if(!changed) break; // 자리 바꿈이 없으면 반복문을 벗어난다.
            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);// 정렬된 결과를 출력한다
            }
            System.out.println();
        }
    }
}

/*
2140332179
1203321479
1023213479
0122133479
0121233479
0112233479
*/
