package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        //defaultValue = 1;
        //privateValue = 1;

        publicMethod();
        protectedMethod(); // 상속관계 or 같은 패키지
//        privateMethod();
//        defaultMethod(); //다른 패키지 접근 불가, 컴파일 오류
        printParent();
    }

}
