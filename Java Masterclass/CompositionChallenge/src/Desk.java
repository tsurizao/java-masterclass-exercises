public class Desk {


    private int cabinetDoors;
    private int shelves;
    private boolean cabinetDoorsOpen;
    Dimensions dimensions;

    public Desk(int cabinetDoors, int shelves, Dimensions dimensions) {
        this.cabinetDoors = cabinetDoors;
        this.shelves = shelves;
        this.dimensions = dimensions;
        cabinetDoorsOpen = false;
    }

    public void openCabinetDoor() {
        cabinetDoorsOpen = true;
        System.out.println("Cabinet door is now open.");
    }

    public void closeCabinetDoor() {
        cabinetDoorsOpen = false;
        System.out.println("Cabinet door is now closed.");
    }

    public void cabinetDoorsState() {
        if (cabinetDoorsOpen) {
            System.out.println("The cabinet doors are open.");
        }
        if (!cabinetDoorsOpen) {
            System.out.println("The cabinet doors are closed.");
        }
    }
}
