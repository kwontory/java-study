package start.array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {10, 20, 30, 40, 50}; // 선언 시에만 해당 방식을 사용할 수 있다.
        // 아래 불가
        /*int[] students;
        students = {10, 20, 30, 40, 50};*/

        // 변수 값 사용
        for(int i = 0;i < students.length;i++) {
            System.out.println("학생" + (i+1) + "의 점수: " + students[i]);
        }
    }
}
