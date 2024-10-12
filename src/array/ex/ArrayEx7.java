package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 학생 수를 입력하세요.: ");
        int studentCount = scanner.nextInt();

        System.out.print("과목 수를 입력하세요.: ");
        int courseCount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("과목명을 차례로 입력하세요.");
        String[] courseName = new String[courseCount];
        for(int i = 0;i < courseCount;i++) {
            courseName[i] = scanner.nextLine();
        }
        int[][] score = new int[studentCount][courseCount];
        int[] sum = new int[studentCount];
        for(int row = 0;row < score.length;row++) {
            System.out.println((row+1)+"번째 학생의 점수를 입력합니다.");
            for(int col = 0; col < score[row].length;col++) {
                System.out.println(courseName[col]+" 점수를 입력하세요.");
                score[row][col] = scanner.nextInt();
                sum[row] += score[row][col];
            }
        }

        for(int i = 0;i < sum.length; i++) {
            System.out.println((i+1) + "번째 학생의 총점: " + sum[i] + ", 평균: " + (double) sum[i]/studentCount);
        }
    }
}
