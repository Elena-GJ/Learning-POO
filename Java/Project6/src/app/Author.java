package app;
import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;

public class Author{
    // Variables
    private String name;
    private String email;
    private String gender;

    // Constructor
    public Author(String name, String email, String gender){
        setName(name);
        setEmail(email);
        setGender(gender);
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getGender(){
        return this.gender;
    }

    // Setters
    public void setName(String name){
        while(name != matcher("([a-zA-Z]+\n)[a-zA-Z]+")){
            try {
                this.name = name;
            } catch (Exception e) {
                System.out.println("Name must be a string.");
            }
        }
    }
    public void setEmail(String email){
        while(email != matcher("[a-z]+@[a-z]+.[a-z]+")){
            try {
                this.email = email;
            } catch (Exception e) {
                System.out.println("The format of the email must be: direction@domain.whateverhere");
            }
        }
    }
    public void setGender(String gender){
        while(gender != 'm' || gender != 'f'){
            try {
                this.gender = gender;
            } catch (Exception e) {
                System.out.println("The gender must be m (masc) or f (fem)");
            }
        }
    }

    // toString modificado
    public String authorToString(){
        return this.name + " (" + this.gender + ") at " + this.email;
    }
}