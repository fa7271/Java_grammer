package C17ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService() {
        authorRepository = new AuthorRepository();
    }
    void register(Author author) {
        if (author.getPassword().length() <= 5) {
            throw new IllegalArgumentException();
        }
        authorRepository.register(author);
//        패스워드가 5자리 이하이면 예외 발생(illegal)

    }

    Optional<Author> login(String email, String password) throws IllegalArgumentException, NoSuchElementException{
//        email이 존재하지 않으면, 예외발생 (nosuch)
//        password 틀리면 예외발생(illegal)

        List<Author> authorList = authorRepository.getAuthors();
        Optional<Author> author1 = Optional.empty();

        boolean exists_email = authorList.stream()
                .anyMatch(member -> email.equals(member.getEmail()));
        if (!exists_email) {
            throw new NoSuchElementException("이메일 틀림");
        }

        boolean exists_password = authorList.stream()
                .anyMatch(member -> password.equals(member.getPassword()));
        if (!exists_password) {
            throw new IllegalArgumentException("비밀번호 틀림");
        }
        author1 = authorRepository.getAuthorByEmail(email);
        return author1;
    }
}
