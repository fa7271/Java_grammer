package C12ClassLecture;

import java.util.ArrayList;
import java.util.Scanner;

//1, 회원가입
//2. 게시글 작성
//3. 회원 목록조회 : 회원 Email들 출력
//4. 회원 상세조회 : 회원명, 회원이메일, 회원작성 글 수
//5. 게시글상세조회: 제목, 작성자 이메일 주소

public class AuthorPostService1 {

    public static void main(String[] args) {

//        Author author = new Author("1", "1", "7271");
//        Author post = new Post("1", "1", s);

        ArrayList<Author> authors = new ArrayList<>();
        ArrayList<Post> posts = new ArrayList<>();
        while (true) {
            System.out.println("1: 회원가입 2: 게시글 작성 3: 회원목록 조회: 4. 회원상세조회 5. 게시글상세조회 5. 종료" );
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            sc.nextLine();
            if (number == 1) {
                String name = sc.nextLine();
                String email = sc.nextLine();
                String passord = sc.nextLine();
                System.out.println(passord);
                Author member = new Author(name,email,passord);
                authors.add(member);
                System.out.println("정상 가입 되었습니다.");
            } else if (number == 2) {
                String title = sc.nextLine();
                String contents =sc.nextLine();
                Long author_id = sc.nextLong();

                Post post = new Post(title, contents, author_id); // 가입한 author_id에 값
                posts.add(post);
                System.out.println("게시글 작성 완료");
            } else if (number == 3) {
                /*
                선생님 코드
                for (Author a : authors) {
                    System.out.println(a.getEmail());
                }
                */
                System.out.println("회원 가입한 이메일 목록입니다.");
                for(Author author : authors){
                    System.out.println(author.getEmail());
                }
            } else if (number == 4) {
                System.out.println("어떤 회원의 정보를 알고 싶으세요 ?");

                /*
                선생님 코드

                Long author_id = Long.parseLong(sc.nextLine());
                Author temp_author = null;
                for (int i = 0; i < authors.size(); i++) {
                    if (authors.get(i).getId() == author_id) {
                        temp_author = authors.get(i); // 주소가 담긴다.
                        break;
                    }
                }
                System.out.println(temp_author.getName() + " " + temp_author.getEmail());
                */


                int idx = Integer.parseInt(sc.nextLine());
                if (idx < authors.size()) {
                    System.out.println("이름: " + authors.get(idx).getName());
                    System.out.println("이메일: " + authors.get(idx).getEmail());
                    // 작성 글 수
                    int count = 0;
                    for (Post post : posts) {
                        if (post.getAuthor_id() == idx) {
                            count++;
                        }
                    }
                    System.out.println(authors.get(idx).getName() + "회원님이 작성하신 게시글 개수는 " + count + " 입니다. ");
                }
                else{
                    System.out.println("가입 정보 없음");
                    throw new IllegalArgumentException("회원이 쓴 게시글 없습니다");
                }
            } else if (number == 5) {
                System.out.println("어떤 게시글을 자세히 보고 싶은가요 ?");
                /*

                Long post_id = Long.parseLong(sc.nextLine());
                Post temp_post = null;
                for (int i = 0; i < authors.size(); i++) {
                    if (authors.get(i).getId() == post_id) {
                        temp_post = posts.get(i); // 주소가 담긴다.
                        break;
                    }
                }
                String author_email = "";
                for (Author a : authors) {
                    if (a.getId() == temp_post.getAuthor_id()) {
                        author_email = a.getEmail();
                    }
                }
                System.out.println("author_email = " + author_email);

                */



                int idx = Integer.parseInt(sc.nextLine()); // 0 번째 게시글
                if (idx < authors.size()) {
                    System.out.println("게시글 제목 : " + posts.get(idx).getTitle());
                    for (Author author : authors) {
                        if ((author.getId().equals(posts.get(idx).getAuthor_id()))) {
                            author.getEmail();
//                            System.out.println("작성하신 이메일 : "+ author.get(idx).getEmail());
                        }
                    }
                }
                else {
                    throw new IllegalArgumentException("그 게시글이 없어요");
                }
            }
            else break;
        }
    }
}

// 엔티티
class Author {
    private Long id;
    private String name;
    private String email;
    private String password;
    static Long static_id = 0L;

    public Author(String name, String email, String password) {
        static_id ++ ;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}

class Post {
    private Long id;
    private String title;
    private String contents;
    private Long author_id;
    static Long static_id = 0L;

    public Post(String title, String contents, Long author_id) {
        static_id ++ ;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author_id = author_id;
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Long getAuthor_id() {
        return author_id;
    }

}

// 인스턴스 변수 생성
//생성자 : 모든 인스턴스 변수 초기화
//모든 변수에 getter 생성