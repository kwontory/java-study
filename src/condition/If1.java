package condition;

public class If1 {
    public static void main(String[] args) {
        int age = 15; // 나이

        // if
        if(age >= 18) System.out.println("성인");
        if(age < 18) System.out.println("미성년자");

        // if-else
        if(age >= 18) {
            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }
    }
}
