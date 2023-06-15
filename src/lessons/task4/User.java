package lessons.task4;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
}
