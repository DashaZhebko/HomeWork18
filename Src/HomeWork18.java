import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args) {
        double totalSum = 0;
        List<Drinks> listDrinks = new ArrayList<>();

        HomeWork18.menu();

        Scanner scanner = new Scanner(System.in);
        String drinksChoice = scanner.nextLine();

        while (!drinksChoice.equals("yes")) {
            Drinks currentDrink = HomeWork18.getDrink(drinksChoice);
            if (currentDrink != null) {
                listDrinks.add(currentDrink);
            }
            drinksChoice = scanner.nextLine();
        }
        scanner.close();

        System.out.println("------Your order:-------");
        for (Drinks drink : listDrinks) {
            totalSum += drink.price;
            drink.prepare();
        }

        System.out.println("Pay for: $" + totalSum);

    }

    public static void menu() {
        System.out.println("Choice drink(s). To confirm the order enter 'yes'");
        for (DrinksMachine d : DrinksMachine.values()) {
            System.out.println(d);
        }
    }

    public static Drinks getDrink(String drink) {
        drink = drink.toUpperCase();
        DrinksMachine drinkType = DrinksMachine.fineTypeDrinksMachine(drink);
        if (drinkType == null) {
            System.out.println(drink + " drink not found on the menu! Please, check the name of drink and enter again!");
            return null;
        }
        switch (drinkType) {
            case TEA:
                return new Tea(Drinks.PRICE_TEA, drinkType);
            case COFFEE:
                return new Coffee(Drinks.PRICE_COFFEE, drinkType);
            case MOJITO:
                return new Mojito(Drinks.PRICE_MOJITO, drinkType);
            case LEMONADE:
                return new Lemonade(Drinks.PRICE_MOJITO, drinkType);
            case KOLA:
                return new Kola(Drinks.PRICE_KOLA, drinkType);
            case MINERAL:
                return new MineralWater(Drinks.PRICE_MINERAL, drinkType);
            default:
                break;
        }
        return null;
    }
}
