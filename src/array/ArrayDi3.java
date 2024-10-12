package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 배열 생성
        int[][] arr = new int[][]{ // 줄바꿈을 해서 가독성을 키우자.
            {1,2,3},
            {4,5,6,7},
            {8,9}
        }; // arr은 {},{},{} 3개의 배열 요소를 가진다.
        for(int row = 0; row < arr.length; row++) { // 행
            for(int column = 0; column < arr[row].length; column++) { // 열
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 라인 변경
        }
    }
}
