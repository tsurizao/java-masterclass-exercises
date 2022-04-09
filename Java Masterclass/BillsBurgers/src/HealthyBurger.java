public class HealthyBurger extends Burger {

    private String breadRollType;
    private boolean spinach = false;
    private boolean beanSprouts = false;
    private double price;

    public HealthyBurger(int meat) {
        super("Healthy Burger", "Brown Rye Roll", 1);
    }

    public void setSpinach(boolean wantSpinach) {
        this.spinach = wantSpinach;
    }

    public void setBeansprouts(boolean wantBeanSprouts) {
        this.beanSprouts = wantBeanSprouts;
    }

    public double getPrice(){
        price = super.getPrice();
        if (spinach){
            price += 0.25;
        }
        if (beanSprouts){
            price += 0.25;
        }
        return price;
    }
}

