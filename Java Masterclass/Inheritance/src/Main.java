public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4 ,1 ,20, "long silky");
        Fish fish = new Fish("Bass", 10, 30, 2, 2, 4);
//        dog.eat();
//        dog.walk();
//        dog.run();
        fish.swim(10);
    }
}
