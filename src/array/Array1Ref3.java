package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students = new int[]{10, 20, 30, 40, 50}; // 배열 생성과 초기화

        // 변수 값 사용
        for(int i = 0;i < students.length;i++) {
            System.out.println("학생" + (i+1) + "의 점수: " + students[i]);
        }
    }
}