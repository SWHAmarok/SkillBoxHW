
public class Cat {
    public static final int EYES_COUNT = 2; // константа количества глаз у кошки
    public static final double MIN_WEIGHT = 1000.0; // константа минимальный вес кошки
    public static final double MAX_WEIGHT = 9000.0; // константа максимальный вес кошки
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double feedWeight; // задаём переменную для подсчёта изменения веса кота
    public static int count; // задаём переменную для количества кошек

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGHT;
        maxWeight = MAX_WEIGHT;
        feedWeight = 0.0 // новосозданный кот пока ничего не ел
        count++; // новосозданный кот увеличивает на 1 общее количество кошек
    }

    public Cat(double weight) // создаём второй конструктов для заведения котов
    {
        this.weight = weight;
        originWeight = weight;
        maxWeight = MIN_WEIGHT;
        maxWeight = MAX_WEIGHT;
        feedWeight = 0.0;
        count++
    }

    public void meow() {
        if (weight < minWeight || weight > maxWeight) // проверка жив ли кот
        {
            System.out.println("Кошка мертва и не может мяукать");
        } else {
            weight = weight - 1;
            if (weight < minWeight) {
                count--;
            }
            System.out.println("Meow");
        }
    }

    public void feed(double amount) {
        if (weight < minWeight || weight > maxWeight) {
            System.out.println("Кошка мертва и не может есть");
        } else {
            weight = weight + amount;
            if (weight > maxWeight) {
                count--;
            }
            feedWeight = feedWeight + amount; // вес съеденного при каждом кормлении

        }
    }

    public void drink(double amount) {
        if (weight < minWeight || weight > maxWeight) {
            System.out.println("Кошка мертва и не может пить");
        } else {
            weight = weight + amount;
            if (weight > maxWeight) {
                count--;
            }
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public void pee() // вводим метод сходить в туалет
    {
        if (weight < minWeight || weight > maxWeight) {
            System.out.println("Кошка мертва и не может сходить в туалет");
        } else {
            weight = weight - getWeight() / 20;
            if (weight < minWeight) {
                count--;
            }
            System.out.println("Упс!!!");
        }
    }

    public Double getEaten() // метод съедено еды
    {
        return feedWeight;
    }

    public static int getCount() // метод, возвращающий количество котов
    {
        return count;
    }
}