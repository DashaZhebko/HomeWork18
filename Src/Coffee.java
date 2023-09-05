public class Coffee extends Drinks{
    public Coffee(double price, DrinksMachine drinksMachine) {
        super(price, drinksMachine);
    }

    @Override
    public void prepare() {
        System.out.println(drinksMachine.name() + " (Recipe: coffee 15g, water 100 ml). Price - $"+
                price+"\n"+  "------------------------------------------------------------------------");
    }
}
