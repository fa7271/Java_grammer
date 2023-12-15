import java.util.*;
import java.util.ArrayList;

//email -> authors -> author -> author_id
public class AuthorPostService {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        while (true) {
            System.out.println("1번:회원가입, 2번:게시글작성, 3번:회원목록조회, 4번:회원상세조회, 5번:게시글상세조회 ");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    System.out.println("회원가입하실 이름을 입력해주세요");
                    String name = sc.nextLine();
                    System.out.println("회원가입하실 이메일을 입력해주세요");
                    String email = sc.nextLine();
                    Author author1 = new Author(name, email);
                    authors.add(author1);
                    break;
                case 2:
                    System.out.println("작성자 이메일을 입력해 주세요");
                    String author_email = sc.nextLine();
                    Author temp_author = null;
                    for (Author a : authors) {
                        if (author_email.equals(a.getEmail())) {
                            temp_author = a;
                            System.out.println("게시글 내용을 입력해주세요");
                            String title = sc.nextLine();
                            System.out.println("작성자 id를 입력해주세요");
                            String contents = sc.nextLine();
                            Post post1 = new Post(temp_author, "제목", "내용");
                            posts.add(post1);
//                            temp_author.posts_add(post1);
                            break;
                        }
                    }

                    /*
                    Long id = Long.parseLong(sc.nextLine());
                    Post post1 = new Post(title, contents, id);
                    posts.add(post1);
                    break;*/
//                    회원목록조회
                case 3:
                    for (Author a : authors) {
                        System.out.println(a.getEmail());
                    }
                    break;
//                    회원상세조회 : 이름, email, 작성글수
                case 4:
                    System.out.println("author email를 입력해주세요");
                    String author_email2 = sc.nextLine();
                    Author temp_author2 = null;

                    for (Author a : authors) {
                        if (a.getEmail().equals(author_email2)) {
                            temp_author = a;
                        }
                    }
                    System.out.println("teamp_author.name = " + temp_author2.getName());
                    System.out.println("temp_author.email = " + temp_author2.getEmail());
                    System.out.println(temp_author2.getPosts().size());
//                    for(Author a : authors){
//                        if(a.getId().equals(author_email)){
//                            temp_author = a;
//                            break;
//                        }
//                    }
//                    int count = 0;
//                    for(Post p : posts){
//                        if(p.getAuthor_id() == temp_author.getId()){
//                            count++;
//                        }
//                    }
//                    System.out.println(temp_author.getName() + " " + temp_author.getEmail() + " " + count);

                    break;
//                    게시글상세조회
                case 5:
                    System.out.println("post id를 입력해주세요");
                    Long post_id = Long.parseLong(sc.nextLine());
                    Post temp_post = null;
                    for (int i = 0; i < posts.size(); i++) {
                        if (posts.get(i).getId() == post_id) {
                            temp_post = posts.get(i);
                            break;
                        }
                    }
                    Author temp_post_author = null;
//                    for(Author a : authors){
//                        if(a.getId() == temp_post.getAuthor_id()){
//                            temp_post_author = a;
//                        }
//                    }
                    System.out.println(temp_post.getTitle() + " " + temp_post_author.getEmail());
                    break;
            }

        }
    }
}

//엔티티
class Author {
    private Long id;
    private String name;
    private String email;
    static Long static_id = 0L;
    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void posts_add(Post post) {
        posts.add(post);
    }

    Author(String name, String email) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
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

}

class Post {
    private Long id;
    private String title;
    private String contents;
    private Author author;
    static Long static_id = 0L;


    Post(Author author, String title, String contents) {
        this.author = author;
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author.posts_add(this);
    }

    public Long getId() {
        return id;
    }

    public Author getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
}
