package oop1;

public class ValueData {
    int value;


    /* 클래스안에 메서드 이 방식이 더 응집도를 높일 수 있다.
    이렇게 하는 것이 객체 지향 프로그래밍 */
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
