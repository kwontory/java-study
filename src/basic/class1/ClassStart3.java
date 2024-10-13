package basic.class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 참조 변수 선언, Student 타입의 객체를 받을 수 있는 변수를 선언한다.
        student1 = new Student(); // 객체(인스턴스) 생성 후 참조값(메모리 주소)을 참조 변수에 대입한다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 90;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

        System.out.println(student1);
        System.out.println(student2);

        // ** 클래스와 사용자 정의 타입
        // 학생을 관리할 수 있는 학생이라는 타입을 만들면 좋겠다.
        // 사용자 정의 타입을 만들기 위해 필요한 설계도 = 클래스
        // 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
    }
}
