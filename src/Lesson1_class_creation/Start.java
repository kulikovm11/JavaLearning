package Lesson1_class_creation;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

        // Car

       Car carObj = new Car("VAZ",75,1.6,false);

//        System.out.println(carObj);


        // Book

        ArrayList <String> authorsArr = new ArrayList<String>();
        authorsArr.add("John Ronald Reuel Tolkien");
        authorsArr.add("Christopher John Reuel Tolkien");

        Book bookObj = new Book("The Silmarillion",365,authorsArr,"fantasy");

//        System.out.println(bookObj);



        // Dog

        Dog dogObj = new Dog("Rex",3,"husky");

//        System.out.println(dogObj);


        //Post

        Post postObj = new Post(1,1,"Some title","Some body");

//        System.out.println(postObj);

        //Comment

        Comment commentObj = new Comment(1,1,"Some name","email@ua","Some txt in the body");
        System.out.println(commentObj);


    }
}
