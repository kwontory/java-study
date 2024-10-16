package basic.pack.b;

public class User {
    public User() { // 접근제어자 public: 다른 패키지에서 이 클래스의 생성자를 호출하려면 public
        System.out.println("패키지 pack.b User 생성");
    }
}
