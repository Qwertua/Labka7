import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
class Salad {
    private MyList<Vegetables> vegetablesList;

    public Salad() {
        this.vegetablesList = new VegetablesList();
    }

    public void addVegetable(Vegetables vegetable) {
        vegetablesList.add(vegetable);
    }

    public MyList<Vegetables> getVegetables() {
        return vegetablesList;
    }
}

