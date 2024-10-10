package loop;

public class While1_2 {
    public static void main(String[] args) {
        // while문: 조건에 따라 코드를 반복해서 실행할 때 사용한다.
        int count = 0;

        // 반복문을 활용해서 슬픈 코드를 고쳐보자..
        while(count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는: " + count);
        }
    }
}
