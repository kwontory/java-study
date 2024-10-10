package loop;

public class For2 {
    public static void main(String[] args) {
        int endNum = 3;
        int sum = 0;
        for(int i = 1;i <= endNum; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // for  vs while..
    // for -> 초기화, 조건, 작업이 한 줄에 모두 들어있어서 보기 편하다.
    // while -> 초기화, 조건, 작업들이 분산되어 있어서 보기 힘들다.
}
