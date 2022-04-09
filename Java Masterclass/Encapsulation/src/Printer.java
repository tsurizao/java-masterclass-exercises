public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex;
    private final String OUT_OF_TONER_MSG = "Out of toner.  Remaining pages canceled.";

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int fillToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                System.out.println("Invalid Toner Amount Being Added.");
            } else {
                tonerLevel += tonerAmount;
                if (this.tonerLevel > 100) {
                    this.tonerLevel = 100;
                }
            }
        }
        getTonerAmount();
        return tonerAmount;
    }

    public void printPages(int number) {
        if (tonerLevel < 1) {
            System.out.println(OUT_OF_TONER_MSG);
        } else {
            if (this.duplex) {
                number = number / 2 + number % 2;
                while (number > 0) {
                    pagesPrinted++;
                    tonerLevel -= 2;
                    number--;
                    if (tonerLevel < 1) {
                        tonerLevel = 0;
                        System.out.println(OUT_OF_TONER_MSG);
                        break;
                    }
                }
            } else {
                while (number > 0) {
                    pagesPrinted++;
                    tonerLevel--;
                    number--;
                    if (tonerLevel < 1) {
                        tonerLevel = 0;
                        System.out.println(OUT_OF_TONER_MSG);
                        break;
                    }
                }
            }
        }
    }

    public int getTonerAmount() {
        System.out.println("Toner level is currently at " + this.tonerLevel + "%.");
        return tonerLevel;
    }

    public int getTotalPagesPrinted() {
        System.out.println("This printer has printed a total of " + this.pagesPrinted + " pages.");
        return pagesPrinted;
    }

    public boolean isThisADuplexPrinter() {
        if (duplex) {
            System.out.println("This is a Duplex Printer.");
        } else if (!duplex) {
            System.out.println("This isn't a Duplex Printer.");
        }
        return duplex;
    }
}
