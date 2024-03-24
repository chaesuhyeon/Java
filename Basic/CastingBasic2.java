public class CastingBasic2 {
    public static void main(String[] args) {
        // 배열 형변환
        int[] intArray = {1, 2, 3, 4, 5};
        Object objectArray = intArray; // 업캐스팅

        // 다운캐스팅
        if (objectArray instanceof int[]) {
            int[] newArray = (int[]) objectArray;
            for (int num : newArray) {
                System.out.println(num);
            }
        }

    }
}
