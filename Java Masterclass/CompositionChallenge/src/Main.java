public class Main {
    public static void main(String[] args) {

        Desk desk = new Desk(3, 4, new Dimensions(4, 5, 2));

        MyRoom myRoom = new MyRoom(desk, new Sofa(25, new Dimensions(8, 3, 3)), new Piano(52, 36, 3, "Mahogany", "Wurlitzer", new Dimensions(4, 3, 2), new MusicBook("Rachmaninoff Most Famous Concertos")));

        myRoom.desk.openCabinetDoor();
        myRoom.desk.cabinetDoorsState();
        myRoom.desk.closeCabinetDoor();
        myRoom.desk.cabinetDoorsState();
        System.out.println(" ");
        System.out.println(myRoom.piano.musicBook.getName());
        myRoom.piano.musicBook.openMusicBook();
        System.out.println(" ");
        myRoom.playPiano();
        myRoom.piano.musicBook.closeMusicBook();
    }
}
