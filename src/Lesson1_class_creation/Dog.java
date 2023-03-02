package Lesson1_class_creation;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Dog {

    String name;
    int age;
    String breed;

    public Dog() {
    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}
