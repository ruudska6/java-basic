package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // Child1 child1 = new Child(); // 자식은 부모를 담을 수 없다.
        // poly.childMethod(); //poly는 parent타입이어서 parent메서드만 알고있음. => 자식의 기느은 호출할 수 없다. 컴파일 오류

    }
}
