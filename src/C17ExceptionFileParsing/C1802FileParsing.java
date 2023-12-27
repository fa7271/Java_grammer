package C17ExceptionFileParsing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C1802FileParsing {
    public static void main(String[] args) {
//        /Users/song/Desktop/Github/Java_grammer/src/C17ExceptionFileParsing
        Path filePath = Paths.get("/Users/song/Desktop/Github/Java_grammer/src/C17ExceptionFileParsing/test_file.txt");
//        버퍼기능이 구현돼 있고, nio패키지에서는 non-blocking방식 사용
//        기본이 UTF_8 이여서 생략해도 된다.
//        CREATE_NEW 이후에 APPEND 실행 가능
        try {
            if (Files.exists(filePath)) {
//                append : 추가
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            }
            else {
//                write : 덮어쓰기
                Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

//        파일 읽기 : readString , readAllLines(List형태)
        try {
            String myst = Files.readString(filePath);
            System.out.println(myst);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("myst1 형태 입니다.");
        try {
            List<String> myst1 = Files.readAllLines(filePath);
            myst1.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
