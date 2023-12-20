package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements mycat = new CatImplements();
        mycat.makeSound();
        DogImplements mydog = new DogImplements();
        mydog.makeSound();


        CatMultiImplements myMultiCat = new CatMultiImplements();
        myMultiCat.makeSound();
//        타입을 interface1 으로 선언하면 interface2에 정의된 메서드는 사용불가.
        System.out.println(myMultiCat.play("송보석", " 수지"));

        DogmultiImplements myMultiDog = new DogmultiImplements();
        myMultiDog.makeSound();
        System.out.println(myMultiDog.play("송보석 ", " 이두나"));

        //    기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명내부클래스 방식으로 사용가능
        AnimalInterface1 ai = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };

    }
}
