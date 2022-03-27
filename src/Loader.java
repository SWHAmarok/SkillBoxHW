
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat barsik = new Cat();
        Cat vaska = new Cat();
        Cat murzik = new Cat();
        Cat mushka = new Cat();
        Cat busya = new Cat();


        System.out.println("Вес Мурки: " + murka.getWeight());
        murka.feed(murka.getWeight() / 10);
        System.out.println("Вес Мурки после еды стал: " + murka.getWeight());
        murka.feedWeight();
        System.out.println("Вес съеденного Муркой: " + murka.feedWeight());
        murka.poop();
        System.out.println("Вес Мурки после тулета стал: " + murka.getWeight());
        System.out.println(murka.getStatus());

        System.out.println("Начальный вес Барсика: " + barsik.getWeight());
        while (barsik.getStatus() != "Dead") {
            barsik.meow();
            System.out.println("Текущий вес Барсика: " + barsik.getWeight());
            System.out.println(barsik.getStatus());
        }

        System.out.println("Начальный вес Васьки: " + vaska.getWeight());
        while (vaska.getStatus() != "Exploded") {
            vaska.drink(vaska.getWeight() / 100);
            System.out.println("Васька попил и его стал: " + vaska.getWeight());
            System.out.println(vaska.getStatus());
        }

    }
}