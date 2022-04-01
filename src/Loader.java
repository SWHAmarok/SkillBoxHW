import java.util.Objects;
import java.util.concurrent.Callable;

public class Loader {
    private static Cat getKitten() {
        return new Cat(1100.0);
    }

    public static void main(String[] args) {
        Cat.count = 0; // счёткик котов. Пока котов нет
        Cat murka = new Cat();
        Cat mushka = new Cat();
        Cat barsik = new Cat();
        Cat vaska = new Cat();
        Cat pushok = new Cat();

        System.out.println("\nВсего создано " + Cat.getCount() + " кошек.\n");
        System.out.println("Вес Мурки: " + murka.getWeight() + " граммов");
        System.out.println("Вес Мушки: " + mushka.getWeight() + " граммов");
        System.out.println("Вес Барсика: " + barsik.getWeight() + " граммов");
        System.out.println("Вес Васьки: " + vaska.getWeight() + " граммов");
        System.out.println("Вес Пушка: " + pushok.getWeight() + " граммов");
        System.out.println("\n=====================================\n");

        murka.feed(150.0);
        mushka.feed(200.0);
        System.out.println("Вес Мурки стал: " + murka.getWeight() + " граммов");
        System.out.println("Вес Мушки стал: " + mushka.getWeight() + " граммов");
        System.out.println("\n=====================================\n");

        while (!barsik.getStatus().equals("Exploded")) {
            barsik.feed(barsik.getWeight() / 10);
        }
        System.out.println("Барсик взорвался!!!");
        System.out.println("Осталось " + Cat.getCount() + " живых кошек.");
        System.out.println("\n=====================================\n");

        while (!vaska.getStatus().equals("Dead")) {
            vaska.meow();
        }
        System.out.println("Васька замяукался до смерти!!!");
        System.out.println("Осталось " + Cat.getCount() + " живых кошек.");
        System.out.println("\n=====================================\n");

        pushok.pee();
        System.out.println("Вес Пушка стал: " + pushok.getWeight() + " граммов");
        pushok.pee();
        System.out.println("Вес Пушка стал: " + pushok.getWeight() + " граммов");
        pushok.pee();
        System.out.println("Вес Пушка стал: " + pushok.getWeight() + " граммов");
        pushok.feed(150.0);
        System.out.println("Пушок съел " + pushok.getEaten() + " граммов корма");
        System.out.println("Вес Пушка стал: " + pushok.getWeight() + " граммов");
        pushok.feed(150.0);
        System.out.println("Пушок съел " + pushok.getEaten() + " граммов корма");
        System.out.println("Вес Пушка стал: " + pushok.getWeight() + " граммов");
        System.out.println("\n=====================================\n");

        Cat kitty = new Cat();
        System.out.println("Вес Китти: " + kitty.getWeight() + " граммов");
        System.out.println("Общее количество увеличилось до " + Cat.getCount() + " живых кошек.");

        Cat busya = getKitten();
        System.out.println("Вес Буси: " + busya.getWeight() + " граммов");
        System.out.println("Общее количество увеличилось до " + Cat.getCount() + " живых кошек.");
    }
}


