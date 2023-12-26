package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

// Repository
public class AuthorRepository {
    List<Author> authors;

    AuthorRepository() {
        authors = new ArrayList<>();
    }

    void register(Author author) {
        authors.add(author);
        System.out.println(authors.size());
    }

    //    다 돌려줌
    List<Author> getAuthors() {
        return authors;
    }

    Optional<Author> getAuthorByEmail(String email) {
        for (Author a : this.authors) {
            if (a.getEmail().equals(email)) {
                return Optional.of(a);
            }
        }
        return Optional.empty();
    }
}
