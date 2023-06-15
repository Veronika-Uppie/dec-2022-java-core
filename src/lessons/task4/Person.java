package lessons.task4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<>();
    private Car car;

    @Override
    public int compareTo(Person o) {
        return this.skills.size() - o.skills.size();
    }

}
