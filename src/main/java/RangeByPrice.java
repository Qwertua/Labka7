
import java.util.List;
import java.util.ArrayList;
class RangeByPrice {
    public List<Vegetables> sortByPrice(MyList<Vegetables> vegetablesList, int price) {
        List<Vegetables> result = new ArrayList<>();
        for (Vegetables vegetable : vegetablesList) {
            if (vegetable.getPricePer1kg() > price) {
                result.add(vegetable);
            }
        }
        return result;
    }
}
