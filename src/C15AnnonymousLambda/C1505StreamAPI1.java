package C15AnnonymousLambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class C1505StreamAPI1 {
    public static void main(String[] args) {

        int[] arr = {20, 10, 4, 12};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        java 에서 함수형프로그래밍을 지원하기 위한 라이브러리 -> StreamAPI
//        foreach : 각 스트림의 각 요소를 소모하면서 동작을 수행
        Arrays.stream(arr).forEach(x-> System.out.println(x));
        Arrays.stream(arr).forEach(System.out::println);

        Arrays.stream(arr).sorted().forEach(System.out::println);

        String[] arrr = {"song","bo","seok"};

        String[] new_myarr = Arrays.stream(arrr).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(new_myarr));
        ArrayList<String> arrayList = new ArrayList<>();
        Arrays.stream(arrr).filter(a -> a.length() >= 3).forEach(arrayList::add);

    }
}
