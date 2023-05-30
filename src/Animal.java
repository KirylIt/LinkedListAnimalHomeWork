import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Animal {

    String name;

    public Animal (String name){
        this.name=name;
    }

    public static void main(String[] args) {
        //Создайте класс Animal, где поле name, - название животного.
        // Добавьте 10 животных в LinkedList, удалите те объекты, name которых начинается с гласной буквы.

        LinkedList<Animal> animals = new LinkedList<>();

        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal elephant = new Animal("elephant");
        Animal elk = new Animal("elk");
        Animal rabbit = new Animal("rabbit");
        Animal bison = new Animal("bison");
        Animal antelope = new Animal("antelope");
        Animal duck = new Animal("duck");
        Animal cow = new Animal("cow");
        Animal bear = new Animal("bear");

        animals.add(dog);
        animals.add(cat);
        animals.add(elephant);
        animals.add(elk);
        animals.add(rabbit);
        animals.add(bison);
        animals.add(antelope);
        animals.add(duck);
        animals.add(cow);
        animals.add(bear);
        System.out.println(animals);
        System.out.println();

        animals.removeIf(a -> a.name.matches("(?i)[AEIOU][a-z]+"));
        System.out.println(animals);

    }

    @Override
    public String toString() {
        return "Animal " +
                "name='" + name + '\'';
    }
}
