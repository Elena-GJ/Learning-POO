package app;

public class Author{
    // Variables
    private String name;
    private String email;
    private String gender;

    // Constructor
    public Author(final String name, final String email, final String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
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
    public void setName(final String name){        
        this.name = name;
    }
    public void setEmail(final String email){
        this.email = email;
    }
    public void setGender(final String gender){
        this.gender = gender;
    }

    // toString modificado
    public String toString(){
        return this.name + " (" + this.gender + ") at " + this.email;
    }
}