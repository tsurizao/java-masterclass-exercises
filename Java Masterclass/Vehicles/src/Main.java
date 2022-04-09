public class Main {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);

        Mustang mustang = new Mustang(5);
        mustang.steer(180);
        mustang.accelerate(0);
        mustang.accelerate(9);
        mustang.accelerate(15);
        mustang.accelerate(26);
        mustang.accelerate(40);
        mustang.accelerate(57);
        mustang.accelerate(90);
        mustang.accelerate(-90);


    }
}
