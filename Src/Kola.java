public class Kola extends Drinks{
    public Kola(double price, DrinksMachine drinksMachine) {
        super(price, drinksMachine);
    }

    @Override
    public void prepare() {
        System.out.println(drinksMachine.name() + " (Recipe: cola 250 ml, ice 50g).Price - $"+
                price+"\n"+  "------------------------------------------------------------------------");
    }
}
