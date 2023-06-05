package lessons.task1;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Car {

   private String model;
   private int power;
   private int volumeEngine;
   private boolean turbo;
}