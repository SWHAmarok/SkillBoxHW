import java.util.Objects;

public class Loader
{
    public static void main(String[] args) {
        // Создаём 7 новых кошек с использованием класса Cat: Cat переменная = new Cat();
        Cat murka = new Cat(); // Создаём кошку Мурку
        Cat barsik = new Cat(); // Создаём кота Барсика
        Cat pushok = new Cat(); // Создаём кота Пушка
        Cat mushka = new Cat(); // Создаём кошку Мушку
        Cat ryzhik = new Cat(); // Создаём кота Рыжика
        Cat vaska = new Cat(); // Создаём кота Ваську

        // Выводим на консоль вес созданных кошек
        System.out.println("Вес Мурки: " + murka.getWeight());
        System.out.println("Вес Барсика: " + barsik.getWeight());
        System.out.println("Вес Пушка: " + pushok.getWeight());
        System.out.println("Вес Мушки: " + mushka.getWeight());
        System.out.println("Вес Рыжика: " + ryzhik.getWeight());
        System.out.println("Вес Васьки: " + vaska.getWeight());

        // Кормим двух кошек и проверяем их вес после кормления
        murka.feed(150.0); // Покоримили Мурку, дав 150 г корма
        barsik.feed(200.0); // Покормили Барсика, дав 150 г корма
        System.out.println("Вес Мурки после кормления стал: " + murka.getWeight()); // Выводим на консоль вес Мурки после кормлнения
        System.out.println("Вес Барсика после кормления стал: " + barsik.getWeight()); // Выводим на консоль вес Барсика после кормления

        // Перекормить кошку до взрыва
        while (!pushok.getStatus().equals("Exploded")) {
            pushok.feed(pushok.getWeight() / 10);
        }
        System.out.println("Статус Пушка: " + pushok.getStatus());

        // Замяукать Мушку до смерти
        while (!Objects.equals(mushka.getStatus(), "Dead")) {
            mushka.meow();
        }
        System.out.println("Статус Мушки: " + mushka.getStatus());

        // Проверим метод drink

        ryzhik.drink(50.0);
        System.out.println("Рыжик попил и теперь весит " + ryzhik.getWeight() + " граммов.");
    }
}