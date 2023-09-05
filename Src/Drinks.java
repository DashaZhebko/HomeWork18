public abstract class Drinks{
    public static final double PRICE_COFFEE = 55.5;
    public static final double PRICE_TEA = 45.0;
    public static final double PRICE_LEMONADE = 70.5;
    public static final double PRICE_MINERAL = 25.0;
    public static final double PRICE_KOLA = 45.5;
    public static final double PRICE_MOJITO = 85.0;

    protected double price;
    protected DrinksMachine drinksMachine;

    public Drinks(double price, DrinksMachine drinksMachine) {
        this.price = price;
        this.drinksMachine = drinksMachine;
    }

    public abstract void prepare();

   }

