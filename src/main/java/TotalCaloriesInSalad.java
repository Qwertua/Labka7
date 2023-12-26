class TotalCaloriesInSalad {
    public int calculateCaloriesInSalad(MyList<Vegetables> vegetablesList) {
        int result = 0;
        for (Vegetables vegetable : vegetablesList) {
            result += vegetable.getCaloriesPer100g();
        }
        return result;
    }
}