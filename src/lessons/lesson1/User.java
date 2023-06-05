package lessons.lesson1;

public class User {

    public int id;
    public String name;
    public boolean status;



    public  User(){

    } // щоб мати змогу робити пустий обьект "дефолтний конструктор"
    public User(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;

    }

    //Alt+insert => toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
