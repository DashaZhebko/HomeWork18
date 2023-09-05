public class Lemonade extends Drinks{
    public Lemonade(double price, DrinksMachine drinksMachine) {
        super(price, drinksMachine);
    }

    @Override
    public void prepare() {
        System.out.println(drinksMachine.name() + " (Recipe: is lemon juice, ice, water, lime). Price - $"+
                price+"\n"+  "------------------------------------------------------------------------");
    }
}
