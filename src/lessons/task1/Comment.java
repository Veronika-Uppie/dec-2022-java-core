package lessons.task1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Comment {
    private int postId;
    private int id;
    public String name;
    private String email;
    public String body;
}
