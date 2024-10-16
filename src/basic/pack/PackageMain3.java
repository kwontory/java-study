package basic.pack;

import basic.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지일 경우 패키지를 명시하지 않아도 된다.
        User user = new User(); // 다른 패키지일 경우 패키지를 명시해야 한다.
        User user2 = new User(); // import 사용하니 편리해졌다.
        basic.pack.b.User user3 = new basic.pack.b.User();
        // 클래스명이 같을 경우, 자주 쓰는 클래스를 import, 나머지는 전체 경로 명시
    }
}
