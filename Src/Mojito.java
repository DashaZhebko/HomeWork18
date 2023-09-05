public class Mojito extends Drinks{
    public Mojito(double price, DrinksMachine drinksMachine) {
        super(price, drinksMachine);
    }

    @Override
    public void prepare() {
        System.out.println(drinksMachine.name() + "(Recipe: tonic 100 ml, ice 40g, lime 1th, gin 50ml,mint 3g).Price - $"+
                price+"\n"+  "------------------------------------------------------------------------");

    }
}
