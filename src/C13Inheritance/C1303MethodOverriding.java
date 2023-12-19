package C13Inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C1303MethodOverriding {
    public static void main(String[] args) {

//       상속 관계일때 부모클래스타입을 자식클래스 객체의 타입으로 지정 가능
//       animal클래스에 정의된 메서드만 사용가능하도록 제약이 발생
        Animal mydog1 = new Dog();
        mydog1.sound();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();

        dog.sound();
        cat.sound();
        animal.sound();

        List<String> myList = new LinkedList<>();


    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("왈왈");
    }
}

class Cat extends Animal{
    void sound() {
        System.out.println("야옹");
    }
}

class Animal {
    void sound() {
        System.out.println("동물은 소리를 냅니다.");
    }
}