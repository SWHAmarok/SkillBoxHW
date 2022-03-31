
public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    public static int count; // Статическая переменная для подсчёта количества кошек

    public double feedCount; // Объявляем переменную для расчета съеденной пищи

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        feedCount = 0.0; //
        count++; // при создании каждой новой кошки количнество увеличивается на 1 кошку

    }

    public void meow() {
        if (weight < minWeight || weight > maxWeight) {
            System.out.println("Кошка мертва и не может мяукать");
        } else {
            weight = weight - 1000;
            if (weight < minWeight) {
                count--;
            }
            System.out.println("Meow");
        }
    }

    public void feed(Double amount) {
        if (weight < minWeight || weight > maxWeight) {
            System.out.println("Кошка мертва и не может есть");
        } else {
            weight = weight + amount;
            feedCount = feedCount + amount;
            System.out.println("Ням-Ням!");
            if (weight > maxWeight) {
                count--;
            }
        }
    }

    public void drink(Double amount) {
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
        if (weight < minWeight || weight > maxWeight) {
            System.out.println("Кошка мертва и не может сходить в туалет");
        } else {
            weight = weight - getWeight() / 100;
            if (weight < minWeight) {
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