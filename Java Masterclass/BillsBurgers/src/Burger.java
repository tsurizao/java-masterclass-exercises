public class Burger {

    private String name;
    private int meat;
    private double price;
    private String breadRollType;
    private boolean cheese = false;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean pickle = false;


    public Burger(String name, String breadRollType, int meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 4.49;
    }

    public double getPrice() {
        price = 4.49;
        if (meat > 1) {
             // more than 1 meat is $0.75 per extra
            for (double i = meat - 1; i > 0; i--) {
               price = price + 0.75;
            }
        }
        if (cheese) {
            price += 0.49;
        }
        if (lettuce) {
            price += 0.25;
        }
        if (tomato) {
            price += 0.25;
        }
        if (pickle) {
            price += 0.25;
        }
        return price;
    }

    public void setBreadRollType(String whatBreadRollType) {
        this.breadRollType = whatBreadRollType;
    }

    public void setMeat(int howManyMeat) {
        this.meat = howManyMeat;
    }

    public void setCheese(boolean wantCheese) {
        this.cheese = wantCheese;
    }

    public void setLettuce(boolean wantLettuce) {
        this.lettuce = wantLettuce;
    }

    public void setTomato(boolean wantTomato) {
        this.tomato = wantTomato;
    }

    public void setPickle(boolean wantPickle) {
        this.pickle = wantPickle;
    }
}
