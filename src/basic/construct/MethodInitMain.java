package basic.construct;

public class MethodInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 15, 90);

        MemberInit[] mebers = {member1, member2};

        for(MemberInit member : mebers) {
            System.out.println(member.name);
            System.out.println(member.age);
            System.out.println(member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
