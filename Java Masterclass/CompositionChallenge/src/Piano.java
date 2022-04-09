public class Piano {

    private int whiteKeys;
    private int blackKeys;
    private int pedals;
    private String color;
    private String model;
    Dimensions dimensions;
    MusicBook musicBook;

    public Piano(int whiteKeys, int blackKeys, int pedals, String color, String model, Dimensions dimensions, MusicBook musicBook) {
        this.whiteKeys = whiteKeys;
        this.blackKeys = blackKeys;
        this.pedals = pedals;
        this.color = color;
        this.model = model;
        this.dimensions = dimensions;
        this.musicBook = musicBook;
    }
    public void pressWhiteKey(){
        System.out.println("A normal sounding note rings throughout the room.");
    }
    public void pressBlackKey(){
        System.out.println("A flat or sharp note rings throughout the room.");
    }

}
