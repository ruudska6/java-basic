package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // final로 선언했기때문에 한번만 할당할수있음.
        //data = new Data();

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
