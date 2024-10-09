package static2;

import static static2.DecoData.staticCall;

// import static static2.DecoData.*;/

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceall();

        //추가
        //인스턴스를 통한 접근 => 마치 인스턴스에 있는 메서드를 호출하는것 같아서 이렇게 하지마.
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근  => static이네 바로 알 수 있음! 클래스를 통해 바로 접근하는구나~
        staticCall();

    }
}
