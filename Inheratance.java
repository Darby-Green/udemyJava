public class Inheratance {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "Fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Faster");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "Fast");
        Dog retriver = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriver, "slow");

    }

    public static void doAnimalStuff(Animal animal,String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");

    }
}
