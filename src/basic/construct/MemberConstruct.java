package basic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        //System.out.println("this()는 생성자 코드 첫 줄에만 사용이 가능하다."); // 컴파일 에러
        this(name,age,50);
        /*this.name = name;
        this.age = age;
        this.grade = 50;*/
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
