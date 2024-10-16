package basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; // this가 없을 경우 스코프 상 매개변수를 가져온다.
        this.age = age;
        this.grade = grade;
    }

}
