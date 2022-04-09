public class DeluxeBurger extends Burger {

    private boolean drink = false;
    private boolean chips = false;
    private double price;

    public DeluxeBurger(boolean drink, boolean chips) {
        super("Deluxe Burger", "Cheesy Bread Roll", 1);
        this.drink = drink;
        this.chips = chips;

    }

    @Override
    public double getPrice() {
        price = 5.25;
        if (drink) {
            price += 0.75;
        }
        if (chips) {
            price += 0.75;
        }
        return price;
    }

    public void setDrink(boolean wantDrink) {
        this.drink = wantDrink;
    }

    public void setChips(boolean wantChips) {
        this.chips = wantChips;
    }

    @Override
    public void setMeat(int howManyMeat) {
        System.out.println("Unable to change change.");
    }

    @Override
    public void setCheese(boolean wantCheese) {
        System.out.println("Unable to change change.");
    }

    @Override
    public void setLettuce(boolean wantLettuce) {
        System.out.println("Unable to change change.");
    }

    @Override
    public void setTomato(boolean wantTomato) {
        System.out.println("Unable to change change.");
    }

    @Override
    public void setPickle(boolean wantPickle) {
        System.out.println("Unable to change change.");
    }
}
