public class Sofa {

    private int numberOfCoins;
    Dimensions dimensions;

    public Sofa(int numberOfCoins, Dimensions dimensions) {
        this.numberOfCoins = numberOfCoins;
        this.dimensions = dimensions;
    }

    public void checkDimensions() {
        System.out.println("The couch is " + dimensions.getWidth() + " feet wide, " + dimensions.getHeight() + " feet tall, and " + dimensions.getDepth() + " feet in depth.");
    }

    public int getCoins(){
        return numberOfCoins;
    }
}
