public class Main {
    public static void main(String[] args) {

        // sour dough, brown rye, wheat, cheesy bread
        System.out.println("! Testing basic Hamburger !");
        Burger burger = new Burger("Burger", "Regular", 1);
        HealthyBurger healthyBurger = new HealthyBurger(1);
        DeluxeBurger deluxeBurger = new DeluxeBurger(true, true);

    }
}
