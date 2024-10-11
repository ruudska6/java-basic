package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); //추상 메서드는 반드시 오버라이딩해서 구현해야한다..

    public void move() {
        System.out.println("동물이 움직입니다.");
    }


}
