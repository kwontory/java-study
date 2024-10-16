package basic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParam) {
        nameField = nameParam; // this가 없어도 구분이 된다.
    }
}
