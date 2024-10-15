package basic.oop;

public class MusicPlayerData {
    int volume = 0;
    boolean power = false;

     void on() {
         power = true;
         System.out.println("음악 플레이어를 시작합니다.");
     }

     void off() {
         power = false;
         System.out.println("음악 플레이어를 종료합니다.");
     }

     void volumeUp() {
         volume++;
         System.out.println("현재 볼륨: " + volume);
     }

     void volumeDown() {
         volume--;
         System.out.println("현재 볼륨: " + volume);
     }

     void showStatus() {
         System.out.println("음악 플레이어 상태 확인");
         if(power) {
             System.out.println("음악 플레이어 ON, 볼륨: " + volume);
         } else {
             System.out.println("음악 플레이어 OFF");
         }
     }
}
