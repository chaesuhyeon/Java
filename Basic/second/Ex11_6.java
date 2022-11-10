import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13} , {21,22,23}};

        System.out.println("arr=" + Arrays.toString(arr)); // arr=[0, 1, 2, 3, 4]
        System.out.println("arr2D=" + Arrays.deepToString(arr2D)); // arr2D=[[11, 12, 13], [21, 22, 23]]

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3); // 범위는 0~2까지 , 3은 포함 안됨
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2,4); // 범위는 2~3까지 , 4는 포함 안됨
        int[] arr6 = Arrays.copyOfRange(arr, 0,7);

        System.out.println("arr2=" + Arrays.toString(arr2)); // arr2=[0, 1, 2, 3, 4]
        System.out.println("arr3=" + Arrays.toString(arr3)); // arr3=[0, 1, 2] 
        System.out.println("arr4=" + Arrays.toString(arr4)); // arr4=[0, 1, 2, 3, 4, 0, 0]
        System.out.println("arr5=" + Arrays.toString(arr5)); // arr5=[2, 3]
        System.out.println("arr6=" + Arrays.toString(arr6)); // arr6=[0, 1, 2, 3, 4, 0, 0]

        int[] arr7 = new int[5];
        Arrays.fill(arr7,9); // 배열을 9로 채움
        System.out.println("arr7=" + Arrays.toString(arr7)); // arr7=[9, 9, 9, 9, 9]

        Arrays.setAll(arr7, i->(int)(Math.random()*6)+1); // 랜덤숫자로 채우기, setAll을 호출할 때는 함수형 인터페이스를 구현한 객체를 매개변수로 지정하던가 람다식을 지정해야한다.
        System.out.println("arr7=" + Arrays.toString(arr7));

        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);

        }

        String[][] str2D = new String[][]{{"aaa", "bbb"} , {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"} , {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true , 다차원 배열일 때는 일반 equal을 사용하면 안됨

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};
        System.out.println("chArr="+Arrays.toString(chArr)); // chArr=[A, D, C, B, E]
        System.out.println("index of B=" + Arrays.binarySearch(chArr,'B')); // index of B=-2 -> binarySearch는 정렬된 상태에서 검색해야 올바른 결과를 출력할 수 있다, 결과값은 검색하는 값의 index를 반환
        System.out.println("= After sorting =");
        Arrays.sort(chArr);
        System.out.println("chArr="+Arrays.toString(chArr)); //chArr=[A, B, C, D, E]
        System.out.println("index of B=" + Arrays.binarySearch(chArr,'B')); // index of B=1
    }
}