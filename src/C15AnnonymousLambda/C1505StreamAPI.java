package C15AnnonymousLambda;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class C1505StreamAPI {
    public static void main(String[] args) {
/*
        int[] arr = {20, 10, 4, 12};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        java 에서 함수형프로그래밍을 지원하기 위한 라이브러리 -> StreamAPI
//        foreach : 각 스트림의 각 요소를 소모하면서 동작을 수행
        stream(arr).forEach(x-> System.out.println(x));
        stream(arr).forEach(System.out::println);

        stream(arr).sorted().forEach(System.out::println);

        String[] arrr = {"song","bo","seok"};

        String[] new_myarr = stream(arrr).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(new_myarr));
        ArrayList<String> arrayList = new ArrayList<>();
        stream(arrr).filter(a -> a.length() >= 3).forEach(arrayList::add);


        String[] stArr = {"HTML", "CSS", "JAVA", "PHYTON"};
//        stream<객체> : 제네릭타입으로 stream객체가 완성된다.
        Stream<String> stStream = stream(stArr);

//        객체 생성
        int[] intArr = {10, 20, 30, 40, 50};
        IntStream intStream = stream(intArr);
        int[] intArr2 = intStream.filter(x -> x >= 20).toArray();
        System.out.println(Arrays.toString(intArr2));
        // toarray 불가능 참조변수의 스트림변환의 경우 제네릭의 타입소거 문제 발생.
        // 제네릭의타입소거란 java버전의 호환성을 위해 제네릭 타입을 런타임 시점에 제거하는것을 의미
        String[] stArr212 = Arrays.stream(stArr).filter(a -> a.length() >= 4).toArray(a -> new String[a]);

//        메소드 참조 방식이 더 일반적
//        메서드 참조 방식 : 클래스 :: 메서드
        String[] stArr3 = stream(stArr).filter(a -> a.length() >= 4).toArray(String[]:: new);
        String stArr4 = Arrays.toString(stream(stArr).filter(a -> a.length() >= 4).toArray());

//        stream 중개 연산 : filter, map, sorted, distinct
        int[] dis_Arr = {10, 40, 35, 50, 55};
        long answer = stream(dis_Arr).distinct().count();
        System.out.println("악 + "+answer);

        String[] dis_stArr = {"java", "java", "pyhton", "C++"};
        String[] dis_stArr1 = stream(dis_stArr).distinct().toArray(String[]::new);

//        mapToInt 를 통해 IntStream으로 변환이 된다.
        int integerStream = stream(dis_stArr).distinct().filter(a -> a.length() <= 3).mapToInt(a -> a.length()).sum();
        System.out.println(integerStream);

//        sotred: 정렬된 스트림 반환
        int[] new_sortArr = stream(dis_Arr).sorted().toArray(); // int라 reverseorder 불가능
        List<Integer> myList = new ArrayList<Integer>(Arrays.asList(1,6,3,2,7,2));

        List<Integer> sorted_myList = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<String> stList = new ArrayList<>(Arrays.asList("java", "pyhton", "C++", "javaScript"));
        List<String> sc_list_res = stList.stream().filter(x -> x.length() >= 4).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sc_list_res);

        int[] arr_plus10 = stream(dis_Arr).map(x -> x + 10).toArray();
        System.out.println(Arrays.toString(arr_plus10));

        int arr_sum = stream(dis_Arr).filter(x -> x % 2 == 0).map(x -> x * 2).sum();

        // 스트림 소모 : forEach, reduce
        stream(dis_Arr).forEach(System.out::println);
        // reduce 누적연산.
        int reduce = stream(dis_Arr).reduce((x, y) -> x + y).orElse(1);
        System.out.println(reduce);
        int reduce1 = stream(dis_Arr).reduce((x, y) -> x + y).getAsInt();


        String a = null;
        System.out.println(a.length());
*/
        /*
        String[] stringarr = {"hello", "java", "world"};
        String s33 = Arrays.stream(stringarr).reduce("",(x, y) -> x +" " + y);
        System.out.println(s33);
        */

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(myList.stream().mapToInt(a -> a).min().getAsInt());
        System.out.println(myList.stream().mapToInt(a -> a).max().getAsInt());
        System.out.println(myList.stream().mapToInt(a -> a).average().getAsDouble());
        System.out.println(myList.stream().mapToInt(a -> a).sum());
        System.out.println(myList.stream().count());


        ArrayList<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("song", 40));
        myStudents.add(new Student("kim", 25));
        myStudents.add(new Student("jang", 35));
        myStudents.add(new Student("han", 20));
        myStudents.add(new Student("shin", 27));

        Student student1 = myStudents.stream().filter(x->x.getAge()>= 30).findFirst().get();
        System.out.println(student1.toString());

//        1.
        System.out.println(myStudents.stream().mapToInt(a->a.getAge()).min().getAsInt());
//        2.
        System.out.println(myStudents.stream().filter(x -> x.getAge() >= 30 && x.getAge() <40).count());
//        3.
        System.out.println(myStudents.stream().mapToInt(a -> a.getAge()).average().getAsDouble());
//        4.
        System.out.println(myStudents.stream().filter(x->x.getAge() <=30).findFirst().get());

//        java8 이후에 나온 Optional객체를 통해 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        Optional객체의 빈값을 명시적으로 넣는 방법: Optional.empty()
        Optional<String> opt1 = Optional.empty();
        if (opt1.isPresent()) {
            System.out.println(opt1.get().compareTo("abc"));
        }else System.out.println("값이 없어용");
        Optional<Object> of = Optional.of("a");// 값이 있다. null 은 넣을 수 없음
        Optional<String> hello = Optional.ofNullable("Hello"); // null일수도 있음을 의미

//        orElse관련 메서드 활용하여 null(빈 값 처리)
//        orElse(), orElseGet(), orElseThrow()
//        orElse() : 값이 있으면 해당값 returne 없으면 default저장값 리턴

// 1. orelse
        System.out.println(opt1.orElse("").compareTo("abc"));
// 2. orElseGet() orElseGet은 null일 때만 불린다.
        System.out.println(opt1.orElseGet(() -> new String()).compareTo("abc"));

//        3. 중요 - orElseThrow(): 값이 있으면 해당값 return, 없으면 지정된 예외를 발생
        int result1 = opt1.orElseThrow(() -> new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
        System.out.println(result1);

//        OptionalInt, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1, 2, 3, 4)).stream().mapToInt(a -> a).max();
        System.out.println(oi.orElseThrow(() -> new NoSuchElementException("No Value")));

//        모든클래스의 조상클래스 :Object
    }
}
