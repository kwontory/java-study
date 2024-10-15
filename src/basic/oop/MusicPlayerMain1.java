package basic.oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volumn = 0;
        boolean power = false;

        // 음악 플레이어 켜기
        power = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);
        // 볼륨 감소
        volumn--;
        System.out.println("음악 플레이어 볼륨: " + volumn);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(power) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volumn);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        power = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
