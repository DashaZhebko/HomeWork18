import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args) {
        double sum = 0;
        List<Drinks> listDrinks = new ArrayList<>();

        HomeWork18.menu();

        Scanner scanner = new Scanner(System.in);
        String drinksChoice = scanner.nextLine();
        while (!drinksChoice.equals("yes")){
           listDrinks.add(HomeWork18.getDrink(drinksChoice));
            drinksChoice = scanner.nextLine();
        }
        System.out.println("------Your order:-------");
        for (Drinks d: listDrinks) {
            sum = sum + d.price;
            d.prepare();
        }

        System.out.println("Pay for: $" + sum);

    }

    public static void menu() {
        System.out.println("Choice drink(s). To confirm the order enter 'yes'");
        for (DrinksMachine d : DrinksMachine.values()) {
            System.out.println(d);
        }
    }

    public static Drinks getDrink(String drink) {
        drink = drink.toUpperCase();

            DrinksMachine drinks = DrinksMachine.valueOf(drink);

        switch (drinks) {
            case TEA:
                Tea tea = new Tea(Drinks.PRICE_TEA, DrinksMachine.TEA);
                return tea;
            case COFFEE:
                Coffee coffee = new Coffee(Drinks.PRICE_COFFEE, DrinksMachine.COFFEE);
                return coffee;
            case MOJITO:
                Mojito mojito = new Mojito(Drinks.PRICE_MOJITO, DrinksMachine.MOJITO);
                return mojito;
            case LEMONADE:
                Lemonade lemonade = new Lemonade(Drinks.PRICE_MOJITO, DrinksMachine.LEMONADE);
                return lemonade;
            case KOLA:
                Kola kola = new Kola(Drinks.PRICE_KOLA, DrinksMachine.KOLA);
                return kola;
            case MINERAL:
                MineralWater mineralWater = new MineralWater(Drinks.PRICE_MINERAL, DrinksMachine.MINERAL);
                return mineralWater;
            default:
                break;

        }
        return null;
    }
}
