public class PC {

    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.monitor = theMonitor;
        this.motherboard = theMotherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Graphics
        monitor.drawPixelAt(900, 800, "yellow");
    }
}
