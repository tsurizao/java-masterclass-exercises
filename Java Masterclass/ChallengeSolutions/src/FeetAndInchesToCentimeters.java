public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double totalInches = (feet * 12 + inches);
            double cent = totalInches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + cent + " centimeters");
            return cent;

        } else {
            return -1;

        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double ft = (int) (inches / 12);
            double in = inches % 12;
            double cent = calcFeetAndInchesToCentimeters(ft, in);
            System.out.println(inches + " inches = " + cent +" centimeters");
            return cent;
        } else {
            return -1;
        }
    }
}
