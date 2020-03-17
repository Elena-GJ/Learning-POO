package app;

public class App {
    public static void main(String[] args) throws Exception {
        Author author1 = new Author("Christopher Paolini", "chrispa@anywhere.com", "m");
        System.out.println(author1.authorToString());
        author1.setEmail("cpaolini@gmail.com");
        System.out.println(author1.authorToString());
    }

    // Test now the exercise about composition
}