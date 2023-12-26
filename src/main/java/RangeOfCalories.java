
import java.util.List;
import java.util.ArrayList;
class RangeOfCalories {


    public List<Vegetables> findVegetablesByCaloriesRange(MyList<Vegetables> vegetablesList, int minCalories, int maxCalories) {
        List<Vegetables> result = new ArrayList<>();
        for (Vegetables vegetable : vegetablesList) {
            if (vegetable.getCaloriesPer100g() >= minCalories && vegetable.getCaloriesPer100g() <= maxCalories) {
                result.add(vegetable);
            }
        }
        return result;
    }
}
