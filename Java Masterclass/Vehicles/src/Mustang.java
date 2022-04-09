public class Mustang extends Car {

    private int yearsUnderWarranty;

    public Mustang(int yearsUnderWarranty) {
        super("Mustang", "2WD", 5, 3, 6, true);
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            System.out.println("Manually shifted to 1st gear.");
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 13) {
            System.out.println("Manually shifted to 1st gear.");
            changeGear(1);
        } else if (newVelocity > 13 && newVelocity <= 27) {
            System.out.println("Manually shifted to 2nd gear.");
            changeGear(2);
        } else if (newVelocity > 27 && newVelocity <= 42) {
            System.out.println("Manually shifted to 3rd gear.");
            changeGear(3);
        } else if (newVelocity > 42 && newVelocity <= 60) {
            System.out.println("Manually shifted to 4th gear.");
            changeGear(4);
        } else if (newVelocity > 60 && newVelocity <= 75) {
            System.out.println("Manually shifted to 5th gear.");
            changeGear(5);
        } else if (newVelocity > 75) {
            System.out.println("Manually shifted to 6th gear.");
            changeGear(6);
        }
        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
