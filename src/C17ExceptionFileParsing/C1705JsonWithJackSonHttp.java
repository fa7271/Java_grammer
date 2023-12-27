package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class C1705JsonWithJackSonHttp {
    static ArrayList<Post> members = new ArrayList<>();

    public static void main(String[] args) {
//        http 클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();


//        http 요청객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/"))
                .GET()
                .build();
//        http응답객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String post = response.body();
            JsonNode jsonNode = mapper.readTree(post);

//            int userId = jsonNode.get("userId").asInt();
//            int id = jsonNode.get("id").asInt();
//            String title = jsonNode.get("title").asText();
//            String body = jsonNode.get("body").asText();
//            members.add(new Post(userId, id, title, body));

//            readvlaue를 사용해서 객체로 곧바로 매핑가능
//            Post mypost2 = mapper.readValue(post, Post.class);
//            System.out.println(mypost2.toString());

//            JsonNode는 트리구조 이므로
            for (JsonNode j : jsonNode) { // 형식으로 가능{]
                Post p = mapper.readValue(j.toString(), Post.class);
                members.add(p);
//                int userId = j.get("userId").asInt();
//                int id = j.get("id").asInt();
//                String title = j.get("title").asText();
//                String body = j.get("body").asText();
//                members.add(new Post(userId, id, title, body));
            }
//            System.out.println(members);

//            자바 객체를 json타입으로 직렬화
            String serialized_Data = mapper.writeValueAsString(members);
            System.out.println(serialized_Data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        for (Post p : members) {
//            System.out.println(p.toString());
//        }
    }
}

class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post() {
    }

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post = {" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}