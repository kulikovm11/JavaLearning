package Lesson1_class_creation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Book {

    String title;
    int pages;
    ArrayList <String> authors;
    String genre;

    public Book() {
    }

    public Book(String title, int pages, ArrayList<String> authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }
}
