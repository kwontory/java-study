package start.condition;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 1;
        int coupon = 0;
        // if-else if-else
        if(grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3 ) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println(coupon); // 1000

        // 초기화
        // switch
        grade = 5;
        coupon = 0;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println(coupon); // 500

        // 2등급도 3등급과 같이 3000원 쿠폰
        grade = 2;
        coupon = 0;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println(coupon); // 3000
    }
}
