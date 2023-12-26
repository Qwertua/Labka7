class Vegetables {
    private int caloriesPer100g;
    private String name;
    private int pricePer1kg;

    public Vegetables(int caloriesPer100g, String name, int pricePer1kg) {
        this.caloriesPer100g = caloriesPer100g;
        this.name = name;
        this.pricePer1kg = pricePer1kg;
    }

    public int getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public String getName() {
        return name;
    }

    public int getPricePer1kg() {
        return pricePer1kg;
    }

    @Override
    public String toString() {
        return "Калорійність: " + caloriesPer100g + ", Назва: " + name + ", Ціна/кг: " + pricePer1kg;
    }
}
