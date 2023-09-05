public class Tea extends Drinks{
    public Tea(double price, DrinksMachine drinksMachine) {
        super(price, drinksMachine);
    }

    @Override
    public void prepare() {
        System.out.println(drinksMachine.name() +  " (Recipe: black tea 5g, water 150 ml). Price - $"+
                price+"\n"+  "------------------------------------------------------------------------");
    }

}
