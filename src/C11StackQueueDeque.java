import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueueDeque {
    public static void main(String[] args) {
        Stack<Object> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);

//        pop : 스택에서 요소 제거 후 해당 요소 반환
        stk.pop();

//        peek : 스택에서 마지막 요소 반환 제거 x
        stk.peek();

        Stack<Object> myHistory = new Stack<>();

        myHistory.push("song");
        myHistory.push("song1");
        myHistory.push("song2");
        myHistory.push("song3");
        myHistory.push("song4");
        while (!myHistory.empty()) {
            System.out.println("myHistory = " + myHistory.pop());
        }

        // 웹페이지 방문
        // 방문한 사이트 출력 + 뒤로가기 긴으구현
        // 스캐너로신규사이트 방문 or 뒤로 가기
        // 신규사이트 방문일 경우, 해당 주소를 추가
        // 뒤로 가기 일 경우 해당 주소 pop


        Stack<Object> history = new Stack<>();
        Stack<Object> history1 = new Stack<>();
        history.push("인덱스페이지");
        history1.push("인덱스페이지");
/*

        Scanner scanner = new Scanner(System.in);
        int index = 0;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("1: 신규방문 2:뒤로가기 3: 앞으로 가기");
            System.out.println(index);
            Integer inputs = Integer.valueOf(scanner.nextLine());
            if (inputs == 1)
            {

                System.out.println("어디 갈건데");
                String url = scanner.nextLine();
                index++;
                // 가>다>라> 갔다가 가로 다시 돌아와서 마를 집어넣으면 라 가 사라짐

                if (index != history1.size() - 1)
                {
                    history1 = (Stack<Object>) history.clone();
                }
                history.push(url);
                history1.push(url);
                System.out.println("현재 페이지는 : " + url + " 입니다.");
            }
             else if (inputs == 2)
            {
                index--;
                if (history.empty())
                {
                    System.out.println("뒤 돌아 갈 곳 없어요");
                }
                 else
                 {
                    System.out.println("이전페이지 = " + history1.get(index));
                }
            }
            else if (inputs == 3) {
                if (index == history1.size() - 1)
                {
                    System.out.println("앞으로 갈 페이지가 없어요");
                }
                 else
                 {
                    index++;
                    System.out.println("앞으로 간 페이지 :" + history1.get(index));
                }
            }
        }
*/

//        LinkedList<Object> Q = new LinkedList<>();
//        Q.add(10);
//        Q.add(20);
//        Q.add(30);

        LinkedList<Object> printer = new LinkedList<>();
        printer.add("문서1");
        printer.add("문서2");
        printer.add("문서3");

        while (!printer.isEmpty()) {
            System.out.println("현재 인쇄 중인 문서 : " + printer.poll());
        }

//        길이의 제한이 있는 큐
        Queue<String> a = new ArrayBlockingQueue<>(3);

//        offer vs add
//        offer는 길이가 충분 할때만 넣는다, add는 공간 다 찼을때 넣으면 에러발생
        a.offer("hello");
        a.offer("hello1");
        a.offer("hello2");
        a.offer("hello3");

        PriorityQueue<Object> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);

        System.out.println("pq = " + pq);

        while (!pq.isEmpty()) {
            System.out.println("pq.poll() = " + pq.poll());
        }

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int count = 0;
        int K = 7;
/*
        int[] scoville = {1, 2, 3, 9, 10, 12};
        ArrayList<Integer> Q = new ArrayList<>();
        for (int i = 0; i < scoville.length; i++) {
            Q.add(scoville[i]);
        }

        while (Q.get(0) < K) {
            int x = Q.get(0);
            int y = Q.get(1);
            Q.remove(0);
            Q.remove(0);
            Q.add(x + y*2);
            Collections.sort(Q);
            System.out.println("Q = " + Q);

            count ++;
            if (Q.size() == 1 && Q.get(0) < K) {
            }
            return count;
        }
        */
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            Q.add(scoville[i]);
        }
        System.out.println("Q = " + Q);
        while (Q.peek() < K) {
            Q.add(Q.poll() + Q.poll() * 2);
            count ++;
            if (Q.size() == 1 && Q.peek() < K)
                System.out.println(count);
        }
        System.out.println(count);

//        ArrayDeque : 양 방향에서 데이터를 삽입 / 제거 할 수 있다.
//        성능 빠름.
        ArrayDeque<Object> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addFirst(20);
        System.out.println("my = " + deque);
        deque.addLast(30);

        System.out.println("deque = " + deque);
        System.out.println("deque = " + deque.pollFirst());
        System.out.println("deque = " + deque.pollLast());



    }
}
