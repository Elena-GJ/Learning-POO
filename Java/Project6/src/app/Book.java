package app;

import java.util.Scanner;

public class Book{
    // Variables
    private String name;
    private Author[] authors;  // a book is written by, at least, 1 author object
    private double price;
    private int qty;  // acronym for "quantity"
    Scanner input = new Scanner(System.in);

    // Constructor
    public Book(String name, Author[] authors){
        this.name = name;
        this.authors = authors;
        setPrice();
        setQty();
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    // Setters
    public void setPrice(){
        this.price = -1;
        while (this.price < 0){
            try {
                System.out.println("Indique el precio del libro '" + this.name +"': ");
                this.price = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Valor para el precio no válido.");
            }
        }
    }

    public void setQty(){
        this.qty = -1;
        while (this.qty < 0){
            try {
                System.out.println("Indique el número de ejemplares de '" + this.name +"': ");
                this.qty = input.nextInt();
            } catch (Exception e) {
                System.out.println("El número de ejemplares no puede ser menor a 0.");
            }
        }
    }

    // toString method
    public String toString(){
        return "The book '" + this.name + "' by ";
    }
}