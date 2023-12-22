package C15AnnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    static class Node{
        int idx;
        String value;

        public Node(int idx, String value) {
            this.idx = idx;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getIdx() {
            return idx;
        }
    }
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparator

//        Comparable 인터페이스에는 CompareTo 메서드가 선언, java의 많은 클래스에서 구현하고 있음 -> 일반적으로 클래스내에서 직접 구현
//        Comparator 인터페이스에는 Compare 메서드가 선언. -> 일반적으로 익명객체를 만들어서 활용

//        Comparable;
//        Comparator;



        String a = "hello";
        String b = "hava";
//        각 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        문자열의 자릿수의 차이가 발생할때, 그 문자의 유니코드 값의차이를 반환

        System.out.println("a.compareTo() = " + a.compareTo(b));

        List<String> myList = new ArrayList<>();
        myList.add(a);
        myList.add(b);

        Collections.sort(myList); // Comparable의 CompareTo 메서드를 통해 정렬
        Collections.sort(myList,Comparator.reverseOrder());
        myList.sort(Comparator.naturalOrder()); //오름
        myList.sort(Comparator.reverseOrder()); // 내림


        Integer inta =1;
        Integer intb =1;
        System.out.println(inta.compareTo(intb));

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("송보석",28));
        studentList.add(new Student("장은지",99));
        studentList.add(new Student("한종승",59));
        studentList.add(new Student("김지한",77));
        studentList.add(new Student("손정민",26));

        System.out.println(studentList);
//        for (Student i : studentList) {
//            System.out.println(i.getName());
//            System.out.println(i.getAge());
//        }

//        방법1. Comparable인터페이스 implements 후 compareTo 메서드 구현 -> 매개변수 1개
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 기본은 오름차순으로 정렬시도,
//                음수이면 내림차순으로 졍럴이 된다.
                return o1.getAge() - o2.getAge();

            }
        });

//        studentList.sort((o1, o2) -> o1.getName().compareTo(o1.getName()));
//        System.out.println(studentList);

        String[] stArr = {"hello", "sdfwfw", "C++", "worldasd2"};
        int[] numbers = {0,0,0};
        ArrayList<Node> arrayList = new ArrayList<>();
        int idx = 0;
        for (int x : numbers) {
            arrayList.add(new Node(idx, String.valueOf(x) ));
            idx ++;
        }

        arrayList.sort(Comparator.comparing(Node::getValue)
                        .thenComparing(Node::getIdx)
                        .reversed());
        String res = "";
        for (Node n : arrayList) {
            if (!res.equals("0")) {
                res += Integer.parseInt(String.valueOf(numbers[n.idx]));
            }
        }
        System.out.println(res);
//        String joinanswer = String.join("", res);



//        arrayList.sort(Comparator.reverseOrder());
//        System.out.println(arrayList);
//        Arrays.sort(inArr, Comparator.reverseOrder());

//        Arrays.sort(stArr,Comparator.reverseOrder());



//        방법2. Comparator를 익명객체 방식으로 활용하여 정렬 -> 매개변수 2개
//        studentList.sort(studentList, Comparator.naturalOrder(Student::getName).thenComparing(Student::getAge));

        studentList.sort(Comparator.comparing(Student::getName)
                .thenComparing(Student::getAge));


        Collections.sort(studentList);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t1.start();

        new Thread(() -> System.out.println("새로만든 쓰레드입니다.")).start();

//        쓰레드 구현방식 : 쓰레드 상속, Runnable
        System.out.println("main 의 쓰레드 입니다.");


    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    조상 클래스의 Object클래스의 toString overriding 하여 객체호출시 자동으로 toString 메소드 호출
    @Override
    public String toString() {
        return "이름은 " + this.name +" 나이는 :" +  this.age;
    }

//    정렬 두 번째
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}