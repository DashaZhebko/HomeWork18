public class MineralWater extends Drinks{
    public MineralWater(double price, DrinksMachine drinksMachine) {
        super(price, drinksMachine);
    }

    @Override
    public void prepare() {
        System.out.println(drinksMachine.name() + " (Recipe: mineral water 300ml, ice 50g. Price - $"+
                price+"\n"+  "------------------------------------------------------------------------");
    }
}
