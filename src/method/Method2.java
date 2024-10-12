package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 수행 중");
        printFooter();
    }

    private static void printHeader() {
        System.out.println("프로그램을 시작합니다.");
        return; // 생략 가능
    }

    private static void printFooter() {
        System.out.println("프로그램을 종료합니다.");
    }

}
