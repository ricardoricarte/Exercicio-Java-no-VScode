import pacote1.Dog;
import pacote2.Person;

public class App {
    public static void main(final String[] args) throws Exception {
        System.out.println("Hello, Java Again!");
        final Dog d1 = new Dog();
        Person p1 = new Person();
        d1.bark();
        p1.hello();

    }
}
