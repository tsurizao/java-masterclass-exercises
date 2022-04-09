public class MyRoom {

    Desk desk;
    Sofa sofa;
    Piano piano;

    public MyRoom(Desk desk, Sofa sofa, Piano piano) {
        this.desk = desk;
        this.sofa = sofa;
        this.piano = piano;
    }

    public void playPiano(){
        piano.pressWhiteKey();
        piano.pressBlackKey();
        System.out.println("Yeah... you need more practice.");
    }
}
