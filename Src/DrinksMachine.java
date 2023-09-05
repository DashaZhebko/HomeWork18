public enum DrinksMachine {
    COFFEE,
    TEA,
    LEMONADE,
    MOJITO,
    MINERAL,
    KOLA;

    static DrinksMachine fineTypeDrinksMachine(String drinkName) {

        for (DrinksMachine drink : DrinksMachine.values()) {
            if (drinkName.equalsIgnoreCase(drink.toString())) {
                return DrinksMachine.valueOf(drinkName);
            }
        }
        return null;
    }
}


