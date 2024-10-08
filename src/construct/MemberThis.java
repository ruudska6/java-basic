package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this 가 없어도 가능하다.
        nameField = nameParameter;
    }
}
