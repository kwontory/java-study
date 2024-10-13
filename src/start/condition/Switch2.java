package start.condition;

public class Switch2 {
    public static void main(String[] args) {
        // if vs switch(if로 대체 가능)
        // 개발자: switch 간결한지 모르겠어! 불편해!
        // Java14부터 새로운 switch 탄생.. 근데 잘 안 쓴다고 한다..허허
        int grade = 2;
        int coupon = switch(grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println(coupon);
    }
}
