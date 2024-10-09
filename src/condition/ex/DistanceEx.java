package condition.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        if(distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }
}
