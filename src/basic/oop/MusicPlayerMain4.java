package basic.oop;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        // 켜기
        player.on();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 상태
        player.showStatus();
        // 끄기
        player.off();

        // **캡슐화**
        // MusicPlayer를 사용할 때, 내부에 어떤 데이터가 있는지 알 필요가 없다.
        // 필요한 기능만 호출해서 사용하면 된다.
        // MusicPlayer 속성과 기능이 하나의 캡슐에 싸여있다.
        // 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다.
    }
}
