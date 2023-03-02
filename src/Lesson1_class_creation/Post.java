package Lesson1_class_creation;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Post {

    int id;
    int postId;
    String title;
    String body;

    public Post() {
    }

    public Post(int id, int postId, String title, String body) {
        this.id = id;
        this.postId = postId;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postId=" + postId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
