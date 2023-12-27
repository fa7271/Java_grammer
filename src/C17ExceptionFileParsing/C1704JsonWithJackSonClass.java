package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.*;

public class C1704JsonWithJackSonClass {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Object> arrayList = new ArrayList<>();

        try {
            File myPath = Paths.get("/Users/song/Desktop/Github/Java_grammer/src/C17ExceptionFileParsing/test-data2.json").toFile();
            JsonNode data1 = mapper.readTree(myPath);
            JsonNode students = data1.get("students");

            for (JsonNode j : students) {
                studnet studnet = mapper.readValue(j.toString(), studnet.class);
                arrayList.add(studnet);
            }
            System.out.println(arrayList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class studnet {
    private int id;
    private String name;
    private int classNumber;
    private String city;

    @Override
    public String toString() {
        return "studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber=" + classNumber +
                ", city='" + city + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}