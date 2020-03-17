package app;

public class App {
    public static void main(String[] args){
        Author author1 = new Author("Christopher Paolini", "chrispa@anywhere.com", "m");
        System.out.println(author1.toString());
        author1.setEmail("cpaolini@gmail.com");
        System.out.println(author1.toString());
    
    // Test now the exercise about composition
        Author[] authors_book1 = {author1};
        Book book1 = new Book("Eragon", authors_book1);
        System.out.print(book1.toString());
        for(Author auth : book1.getAuthors()){  // Seguir el paradigma de la OOP con el getAuthors :)
            System.out.println(auth.toString());  // Recuerda que los arrays de cosas no se puede acceder directamente ;_;
        }

        Author author2 = new Author("Napoleón Bonaparte", "-", "m");
        Author author3 = new Author("Nicolás Maquiavelo", "-", "m");
        Author[] authors_book2 = {author3, author2};
        Book book2 = new Book("El príncipe. Con anotaciones de Napoleón Bonaparte", authors_book2);
        System.out.println(book2.toString());
        for(Author auth : book2.getAuthors()){
            System.out.println(auth.toString());
        }
    }
}