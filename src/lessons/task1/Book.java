package lessons.task1;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Book {

    public String title;
    public int pages;
    public String Authors;
    public String genre;
}