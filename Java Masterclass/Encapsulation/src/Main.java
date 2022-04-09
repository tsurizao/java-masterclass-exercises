public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(100, true);

        printer.getTonerAmount();
        printer.printPages(20);
        printer.getTotalPagesPrinted();
        printer.getTonerAmount();
        printer.printPages(37);
        printer.getTotalPagesPrinted();
        printer.getTonerAmount();
        printer.isThisADuplexPrinter();
        printer.printPages(94);
        printer.getTotalPagesPrinted();
        printer.getTonerAmount();
        printer.fillToner(53);
        printer.fillToner(50);
        printer.fillToner(47);
        printer.printPages(7);
        printer.getTotalPagesPrinted();
        printer.getTonerAmount();
    }
}
