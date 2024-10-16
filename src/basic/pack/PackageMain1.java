package basic.pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지일 경우 패키지를 명시하지 않아도 된다.
        basic.pack.a.User user = new basic.pack.a.User(); // 다른 패키지일 경우 패키지를 명시해야 한다.
    }
}
