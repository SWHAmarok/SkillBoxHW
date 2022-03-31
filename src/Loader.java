import java.util.Objects;

public class Loader {
    public static void main(String[] args) {
        // Создаём 7 новых кошек с использованием класса Cat: Cat переменная = new Cat();
        Cat murka = new Cat(); // Создаём кошку Мурку
        Cat barsik = new Cat(); // Создаём кота Барсика
        Cat pushok = new Cat(); // Создаём кота Пушка
        Cat mushka = new Cat(); // Создаём кошку Мушку
        Cat ryzhik = new Cat(); // Создаём кота Рыжика


        // Выводим общее количество созданных кошек
        System.out.println("\nОбщее количество созданных кошек: " + Cat.count);
        System.out.println("\n=======================\n");

        // Выводим на консоль вес созданных кошек
        System.out.println("Вес Мурки: " + murka.getWeight());
        System.out.println("Вес Барсика: " + barsik.getWeight());
        System.out.println("Вес Пушка: " + pushok.getWeight());
        System.out.println("Вес Мушки: " + mushka.getWeight());
        System.out.println("Вес Рыжика: " + ryzhik.getWeight());


        System.out.println("\n=======================\n");

        // Кормим двух кошек и проверяем их вес после кормления
        murka.feed(150.0); // Покоримили Мурку, дав 150 г корма
        barsik.feed(200.0); // Покормили Барсика, дав 150 г корма
        System.out.println("Вес Мурки после кормления стал: " + murka.getWeight()); // Выводим на консоль вес Мурки после кормлнения
        System.out.println("Вес Барсика после кормления стал: " + barsik.getWeight()); // Выводим на консоль вес Барсика после кормления

        System.out.println("\n=======================\n");

        // Перекормить кошку до взрыва
        while (!pushok.getStatus().equals("Exploded")) {
            pushok.feed(pushok.getWeight() / 5);
        }
        System.out.println("Статус Пушка: " + pushok.getStatus() + "\nПушок взорвался!");
        System.out.println("Осталось живых кошек: " + Cat.getCount());
        System.out.println("\n=======================\n");
        // Замяукать Мушку до смерти
        while (!mushka.getStatus().equals("Dead")) {
            mushka.meow();
        }
        System.out.println("Статус Мушки: " + mushka.getStatus() + "\nМушка умерла!");
        System.out.println("\n=======================\n");

        System.out.println("Осталось живых кошек: " + Cat.getCount());
        System.out.println("\n=======================\n");

        Cat vaska = new Cat(); // Создаём кота Ваську
        System.out.println("Создаём нового кота Ваську");
        System.out.println("Вес Васьки: " + vaska.getWeight());
        System.out.println("\n=======================\n");
        System.out.println("Осталось живых кошек: " + Cat.getCount());
        System.out.println("\n=======================\n");
        // Проверим метод drink
        ryzhik.drink(50.0);
        System.out.println("Рыжик попил и теперь весит " + ryzhik.getWeight() + " граммов.");
        System.out.println("\n=======================\n");
        vaska.feed(150.0);
        System.out.println("Вес Васьки стал " + vaska.getWeight());
        vaska.feedCount();
        System.out.println("Вес съеденной Васькой пищи " + vaska.feedCount + " граммов.");
        System.out.println("\n=======================\n");
        murka.pee();
        System.out.println("Вес Мурки стал: " + murka.getWeight());
        murka.getStatus();

    }
}


