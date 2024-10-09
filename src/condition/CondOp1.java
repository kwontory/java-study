package condition;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status;
        if(age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println(status);

        // 삼항(조건) 연산자, 참 거짓에 따라 특정 값을 구하는 경우에 사용
        status = (age >= 18) ? "성인2" : "미성년자2";
        System.out.println(status);
    }
}
