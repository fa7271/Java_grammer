package C15AnnonymousLambda;

public class C1502AnnonymousClass {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void makeSound(int n) {
                System.out.println("집가기");
            }
        };
        dog.makeSound(10);

//        익명객체가 1개 일경우 람다로 표현 가능
//        () 부분에 매개변수 지정하여 구현체에서 활용
        Animal cat = (n) -> System.out.println("야옹" + n);
        cat.makeSound(10);
    }
}

interface Animal {
    void makeSound(int n);
}