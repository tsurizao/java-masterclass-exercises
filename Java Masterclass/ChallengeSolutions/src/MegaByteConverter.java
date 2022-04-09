public class MegaByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        //Converts Kilobytes into Megabytes

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
