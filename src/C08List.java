import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C08List {
    public static void main(String[] args) {

        /*
        // 동일
//        ArrayList<String> myList = new ArrayList<>();
        List<String> myList = new ArrayList<>();

//        초기 값 생성 방법1.
        myList.add("java");
        myList.add("python");
        myList.add("c++");

//        초기 값 생성 방법2. 한꺼번에 add( 배열을 이용한 변환)
        String[] myArr1 = {"java","pyhton","C++"};

        int[] myIntArr1 = {1, 2, 3};
        List<Integer> myIntList1 = new ArrayList<>();
        for (int a : myIntList1) {
            myIntList1.add(a);
        }
        System.out.println("myIntList1 = " + myIntList1);

        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(20);
        myList1.add(30);

//        addAll(Collection 객체 ) : 특정 리스트의 요소를 모두 add
//        myList.addAll(myList1);


//        get (int index): 특정위츼의 요소를 반환
        System.out.println("myList1.get(0) = " + myList1.get(0));

        // for 문을 돌려 전체 출력.
        for (int i = 0; i < myList1.size(); i++) {
            System.out.println("myList1 = " + myList1.get(i));
        }
//        remove 항목 삭제
        myList1.remove(Integer.valueOf(0));

//        set (int index, E element) index자리의 값 변경
        myList1.set(myList1.size()-1, 40);
        System.out.println("myList1 = " + myList1);

 */
//        contains(E, element) : 특정값이 있는지 없는 booelan return
//        System.out.println("myList.contains(30) = " + myList.contains(30));

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(10);
        myList.add(20);
        myList.add(30);

//        같은 숫자가 있으면 맨 앞 값을 리턴한다.
        System.out.println(myList.indexOf(10));

//        전체삭제: Clear
        myList.clear();
        System.out.println("myList = " + myList);

        ArrayList<int[]> myList1 = new ArrayList<>();
        myList1.add(new int[1]);
        myList1.add(new int[2]);
        myList1.add(new int[3]);
        System.out.println("myList1 = " + myList1);
        myList1.get(1)[0] = 10;
        myList1.get(1)[1] = 20;

//        for (int[] ints : myList1) System.out.println(Arrays.toString(ints));

        myList1.clear();
        myList1.add(new int[3]);
        myList1.add(new int[3]);
        myList1.add(new int[3]);

        int cal = 1;
        for (int i = 0; i < myList1.size(); i++) {
            for (int j = 0; j < myList1.get(i).length; j++) {
                myList1.get(i)[j] = (j+1) * cal;
            }
            cal = cal * 10;
        }
        for (int[] ints : myList1) System.out.println(Arrays.toString(ints));

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5,3,2,7,4,10));
//        리스트 정렬1. Collections.sort()
        Collections.sort(arrayList);
        System.out.println("arrayList = " + arrayList);

        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("arrayList = " + arrayList);
//        리스트 정렬2. 객체.sort()


//        1. String 배열을 List로 반환
        String[] String_arr = {"song", "bo", "seok"};
        List<String> String_arr1 = Arrays.asList(String_arr);
        System.out.println("String_arr = "+ String_arr1);

//        1-2. for 문
        List<String> arrayList1 = new ArrayList<>();
        for (String a : String_arr) {
            arrayList1.add(a);
        }
//        1-3. StreampAPI;
        List<String> strlist3 = Arrays.stream(String_arr).collect(Collectors.toList());

//        2. int 배열을 list 로변환
//        2.1 arrays.asList 사용 불가
//        2.2 for문 담기
//        2.3 streamAPI 사용

//        3. String 리스트를 String 배열로 변환
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("song", "bo", "seok"));
        String[] strings_arr = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            strings_arr[i] = strings.get(i);
        }
        System.out.println("Arrays.toString(strings_arr) = " + Arrays.toString(strings_arr));

        String[] stringsArr = strings.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(stringsArr));


        Integer[] numbers = {2, 1, 3, 4, 1};
        Integer[] result = {2,3,4,5,6,7};

        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < numbers.length-1; i ++){
            for(int j = i+1 ; j < numbers.length; j ++){
                if (!answer.contains(numbers[i] + numbers[j])) {
                    answer.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(answer);
        int[] arr2 = answer.stream().mapToInt(Integer::intValue).toArray();
        int [] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % 3 == 0) {
                res.add(numlist[i]);
            }
        }
        Object[] x = res.toArray();
        System.out.println("x = " + x);
    }
}
