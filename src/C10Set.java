import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C10Set {
    public static void main(String[] args) {
/*

        HashSet<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("d");
        mySet.add("d");
        mySet.add("h");
        mySet.add("e");
        System.out.println("mySet = " + mySet);

        String[] ex = {"basketball", "baseball", "baseball", "soccer", "soccer"};

//        1. 포문
        HashSet<String> mySet2 = new HashSet<>();
        for (int i = 0; i < ex.length; i++) {
            mySet2.add(ex[i]);
        }
        System.out.print("mySet2 = " + mySet2);
        System.out.println("mySet2 = " + mySet2.size());


//        list를 인자 값으로 받아 초기값 세팅 가능

        ArrayList<String> myList = new ArrayList<>();
        myList.add("song");
        myList.add("song");
        myList.add("bo");
        HashSet<String> MySet = new HashSet<>(myList);
        System.out.println("m = " + MySet);

//        2. 선언과 동시에,
        HashSet<String> myset3 = new HashSet<String>(Arrays.asList(ex));
        System.out.print("mySet3 = " + myset3);
        System.out.println("myset3 = " + myset3);

        myset3.remove("baseball");

        int[] myArrInt = {1, 6, 43, 2, 3, 5,};
        HashSet<Integer> myArrSet = new HashSet<>();
        for (int a : myArrInt) {
            myArrSet.add(a);
        }
        System.out.println("myArrSet = " + myArrSet);
*/

        Set<String> mySet1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
        Set<String> mySet2 = new HashSet<>(Arrays.asList("java", "html", "css"));

        // 교집합 retainAll
        Set<String> temp1 = new HashSet<>(mySet1);
        temp1.retainAll(mySet2);
        System.out.println("temp1 = " + temp1);
        // 합침합 addAll
        Set<String> temp2 = new HashSet<>(mySet1);
        temp2.addAll(mySet2);
        System.out.println("temp2 = " + temp2);
        // 차집합 removeAll
        Set<String> temp3 = new HashSet<>(mySet1);
        temp3.removeAll(mySet2);
        System.out.println("temp3 = " + temp3);
/*
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = true;

        Arrays.sort(phone_book);
        for (int i = 0; i <phone_book.length-1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
            }
        }
        */

//        순서가 없으므로 enhanced for문, iterator 사용n

        TreeSet<String> myTreeSet = new TreeSet<>();
//        Integer 형 을 intvalue로 한 번에 바꿔줌.
//        Arrays.stream(arr).mapToInt(Integer::intValue).toArray();


    }
}
