package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();
        Animal[] aniamlArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        for (Animal animal : aniamlArr) {
            soundAnimal(animal);
        }
    }

    //동물이 추가되어도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
