package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        // 권장하지않는데 이유는 ... count가 인스턴스변수인가? 헷갈림. => 오해할 수 있음.

        //클래스를 통한 접근
        System.out.println(Data3.count);
        // 이건 100% 클래스 변수네 생각이 듦!
    }
}

