package basic.oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // **각 기능을 메서드로 모듈화**
        // 장점: 중복 제거, 변경 영향 범위 축소(메서드 내부), 메서드명으로 더욱 직관적
        // 데이터와 기능이 분리되어 있으므로 객체 지향 프로그래밍으로 볼 수 없다.

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.power = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.power = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.power) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
