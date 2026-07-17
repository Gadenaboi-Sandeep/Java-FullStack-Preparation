package Chinna.OOPS.ClassObjects;

public class Books {

    String title;
    String author;
    int price;

    void display(){
        System.out.println("Book title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {
        Books bk = new Books();
        bk. title="Can we be strangers again";
        bk.author=".....Singh";
        bk.price=1200;
        bk.display();
    }
}
