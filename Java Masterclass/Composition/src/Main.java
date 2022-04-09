public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("Thor V2", "Rosewill", "1000", dimensions);
        Monitor theMonitor = new Monitor("Optix MAG", "MSI", 32, new Resolution(1920, 1080));
        Motherboard theMotherboard = new Motherboard("Thunderbolt", "MSI", 4, 10, "Lightning 3.32");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        PC otherPC = new PC(new Case("220B", "Dell", "800", new Dimensions(20, 20, 20)), new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540,1440)), new Motherboard("BJ-200", "Asus", 4, 6, "Version 2.44"));

        otherPC.powerUp();

        thePC.powerUp();

        theMotherboard.loadProgram("Dota 2");
    }
}
