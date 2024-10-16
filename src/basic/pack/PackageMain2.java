package basic.pack;

import basic.pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지일 경우 패키지를 명시하지 않아도 된다.
        basic.pack.a.User user = new basic.pack.a.User(); // 다른 패키지일 경우 패키지를 명시해야 한다.
        User user2 = new User(); // import 사용하니 편리해졌다.
    }
}
