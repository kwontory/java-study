package array;

import java.util.Arrays;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // {0,0,0,0,0} 참조값(메모리 주소) 반환
        System.out.println(students); // [I@10f87f48, [I: int 배열, 주소 16진수
        System.out.println(Arrays.toString(students));

        // 변수 값 대입
        students[0] = 10;
        students[1] = 20;
        students[2] = 30;
        students[3] = 40;
        students[4] = 50;

        // 변수 값 사용
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
    }
}
