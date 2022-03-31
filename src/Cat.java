
public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public double feedCount; // Объявляем переменную для расчета съеденной пищи

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        feedCount = amount;
        System.out.println("Ням-Ням!");
    }

    public void drink(Double amount)

    {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    // Вводим метод для расчёта съеденной еды
    public double feedCount() {
        return feedCount;
    }

    // Вводим метод "Сходить в туалет"
    public void pee() {
        weight = weight - getWeight() / 100;
        System.out.println("Упс! А что это произошло?");
    }
}