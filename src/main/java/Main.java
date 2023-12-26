
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad();
        salad.addVegetable(new Vegetables(10, "Помідор", 100));
        salad.addVegetable(new Vegetables(15, "Огірок", 80));
        salad.addVegetable(new Vegetables(75, "Капуста", 50));
        salad.addVegetable(new Vegetables(50, "Морква", 120));

        RangeOfCalories range = new RangeOfCalories();
        List<Vegetables> result = range.findVegetablesByCaloriesRange(salad.getVegetables(), 50, 75);
        System.out.println("Овочі у вказаному діапазоні калорійності:");
        for (Vegetables vegetable : result) {
            System.out.println(vegetable);
        }

        RangeByPrice price = new RangeByPrice();
        List<Vegetables> res = price.sortByPrice(salad.getVegetables(), 100);
        System.out.println("Овочі ціна яких перевищує задану ціну:");
        for (Vegetables vegetables : res) {
            System.out.println(vegetables);
        }

        TotalCaloriesInSalad calories = new TotalCaloriesInSalad();
        System.out.println("Загальна кількість калорій у салаті:");
        System.out.println(calories.calculateCaloriesInSalad(salad.getVegetables()));
    }
}
