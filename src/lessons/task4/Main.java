//Створити List Юзерів
//- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//
//створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .


//Створити клас котрий відповідає наступній моделі
//{
//    id: 1,
//    name: 'vasya',
//    surname: 'pupkin',
//    email: 'asd@asd.com',
//    age: 31,
//    gender: 'MALE',
//    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//    car: {model: 'toyota', year: 2021, power: 250}
//}
//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого


package lessons.task4;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Cocos", 21));
        users.add(new User(2, "Banan", 25));
        users.add(new User(3, "Ananas", 11));
        users.add(new User(4, "Mango", 30));


//      - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)

        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        System.out.println(users);

        users.sort(Comparator.comparingInt(User::getAge));
//        System.out.println(users);

        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
//        System.out.println(users);


//- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println(users);

        users.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        System.out.println(users);


        //створити ArrayList зі словами на 15-20 елементів. - відсортувати його за алфавітом .

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One"));
        words.add(new Word("Two"));
        words.add(new Word("Three"));
        words.add(new Word("Four"));
        words.add(new Word("Five"));
        words.add(new Word("Six"));
        words.add(new Word("Seven"));
        words.add(new Word("Eight"));
        words.add(new Word("Nine"));
        words.add(new Word("Ten"));
        words.add(new Word("Eleven"));
        words.add(new Word("Twelve"));
        words.add(new Word("Thirteen"));
        words.add(new Word("Fourteen"));
        words.add(new Word("Fifteen"));

        words.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));



//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків

        HashSet<Person> people = new HashSet<>();

//        people.removeIf(person -> person.getGender() == Gender.MALE);
//        people.removeIf(person -> person.getGender().equals(Gender.MALE));

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person next =  iterator.next();
            if (next.getGender().equals(Gender.MALE)) {
                iterator.remove();
            }
        }


        //Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

        TreeSet<Person> treeSet = new TreeSet<>();
        

    }
}
