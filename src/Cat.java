
public class Cat {
    private double originWeight;
    private double weight;

    private static final int EYES_QUANTITY = 2; // Константа "Количество глаз"
    private static final double MIN_WEIGHT = 1000.0; // Константа "Минимальный вес"
    private static final double MAX_WEIGHT = 9000.0; // Константа "Максимальный вес"
    public static int count; // Статическая переменная для подсчёта количества кошек

    public double feedCount; // Объявляем переменную для расчета съеденной пищи

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        feedCount = 0.0; //
        count++; // при создании каждой новой кошки количнество увеличивается на 1 кошку

    }

    public void meow() {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            System.out.println("Кошка мертва и не может мяукать");
        } else {
            weight = weight - 1000;
            if (weight < MIN_WEIGHT) {
                count--;
            }
            System.out.println("Meow");
        }
    }

    public void feed(Double amount) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            System.out.println("Кошка мертва и не может есть");
        } else {
            weight = weight + amount;
            feedCount = feedCount + amount;
            System.out.println("Ням-Ням!");
            if (weight > MAX_WEIGHT) {
                count--;
            }
        }
    }

    public void drink(Double amount) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            System.out.println("Кошка мертва и не может пить");
        } else {
            weight = weight + amount;
            if (weight > MAX_WEIGHT) {
                count--;
            }
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus()
    {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
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
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            System.out.println("Кошка мертва и не может сходить в туалет");
        } else {
            weight = weight - getWeight() / 100;
            if (weight < MIN_WEIGHT) {
                count--;
            }
            System.out.println("Упс! А что это произошло?");
        }
    }

    // Вводим метод getCount, возвращающий количество кошек
    public static int getCount() {
        return count;
    }
}