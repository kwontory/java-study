package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // 일반 for문
        for(int i = 0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 for문, for-each문
        // iter 입력 후 enter
        // index가 필요한 경우에는 사용할 수 없다.
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
