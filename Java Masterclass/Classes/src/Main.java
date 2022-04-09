public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        holden.setModel("holden");

        System.out.println("This model is " + porsche.getModel());

    }
}