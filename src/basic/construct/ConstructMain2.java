package basic.construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // ctrl + p : 파라미터 정보
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",15);

        MemberConstruct[] members = {member1,member2};
        for (MemberConstruct member : members) {
            System.out.println(member.name);
            System.out.println(member.age);
            System.out.println(member.grade);
        }
    }

}
