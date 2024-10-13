package start.array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60};
        int total = 0;
//        double avg; //  변수는 필요할 때 선언

        for(int score : students) {
            total += score;
        }
        double avg = (double) total/ students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}
