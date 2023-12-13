import java.util.*;

public class C09Map {
    public static void main(String[] args) {

//        순서 보장 x
        /*Map<String, String> map = new HashMap<>();
        map.put("송", "보석");
        map.put("장", "은지");
        map.put("손", "정민");
        map.put("임", "재영");
        System.out.println(map);
        System.out.println("map.entrySet() = " + map.entrySet());

//        putIfAbsent 없으면 넣
//        put 데이터 넣기, 이미 키가 있으면 덮어쓰기

//        getOrDefault : get 하는데 없으면 Defualt값
        System.out.println(map.getOrDefault("신", "엔코아"));


        // key 밸류값 하나씩 출력
        for (String a : map.keySet()) {
//            System.out.println(a);
//            System.out.println(map.get(a));
        }*/

        Map<String, String> map = new HashMap<>();
        map.put("basektball", "농구");
        map.put("soccer", "축구");
        map.put("baseball", "야구");


        Iterator<String> iterator = map.keySet().iterator();
//        next 메소드는 데이터를 소모시키면서 return 한다.
//        System.out.println(iterator.next()); // 3개
//        System.out.println(iterator); // 2개
//        hasNext() : itertaor 안에 값이 있는지 없는지.

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<String> mylist = new ArrayList<>();
        mylist.add("basketball");
        mylist.add("basketball");
        mylist.add("basketball");
        mylist.add("baseball");
        mylist.add("baseball");
        mylist.add("baseball");
        mylist.add("tennis");

        System.out.println(mylist.get(0));
        Map<String, Integer> mpas = new HashMap<>();

        for (String i : mylist) {
//            mpas.put(i, mpas.getOrDefault(i,0) + 1);
            if (!mpas.containsKey(i)) {
                mpas.put(i,1);
            }
            else{
                mpas.put(i,mpas.get(i)+1);
            }
        }
        for (String a : mpas.keySet()) {
            System.out.print(a + "을 좋아하는 사람은");
            System.out.println(mpas.get(a) + "명 입니다.");
        }

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Map<String, Integer> parti = new HashMap<>();
        String answer = "";
        for (String i : participant) parti.put(i, parti.getOrDefault(i,0) + 1);
        for (String i : completion) parti.put(i, parti.get(i) - 1);
        for (String i : parti.keySet()) {
            if (parti.get(i) == 1) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

//        ㅣㅑㅜㅏㄷ옴노ㅡ메 : 데이터 삽입순서 유지
        LinkedHashMap<String, Integer> myMap1 = new LinkedHashMap<>();
        myMap1.put("hello5", 1);
        myMap1.put("hello4", 1);
        myMap1.put("hello3", 1);
        myMap1.put("hello2", 1);
        myMap1.put("hello1", 1);
        System.out.println("myMap1 = " + myMap1);

        TreeMap<String, Integer> myMap2 = new TreeMap<>();
        myMap2.put("hello5", 1);
        myMap2.put("hello4", 1);
        myMap2.put("hello3", 1);
        myMap2.put("hello2", 1);
        myMap2.put("hello1", 1);
        System.out.println("myMap2 = " + myMap2);
    }
}

