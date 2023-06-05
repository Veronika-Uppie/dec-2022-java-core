//закінчити опис класів Car,Dog,Book
//
//
//        створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/posts/1
//
//        та клас який описував би подібні об'єкти
//        https://jsonplaceholder.typicode.com/comments/1

package lessons.task1;
public class Main {

    public static void main(String[] args) {


        Car car = new Car();
        Car car1 = new Car("Reno", 123,123, true);

        Book book = new Book("A Higher Standard", 280, "John Doe", "genre" );

        Post post1 = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        Comment comment1 = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz",  "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");

    }
}
