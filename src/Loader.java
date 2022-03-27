
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat barsik = new Cat();
        Cat vaska = new Cat();

        System.out.println("Вес Мурки: " + murka.getWeight());
        murka.feed(murka.getWeight() / 10);
        System.out.println("Вес Мурки после еды стал: " + murka.getWeight());
        murka.feedWeight();
        System.out.println("Вес съеденного Муркой: " + murka.feedWeight());
        murka.poop();
        System.out.println("Вес Мурки после тулета стал: " + murka.getWeight());
        System.out.println(murka.getStatus());

    }
}