package lessons.task1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
