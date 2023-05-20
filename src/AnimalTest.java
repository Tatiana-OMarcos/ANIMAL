public class AnimalTest {
        public static void main(String[] args) {
            Animal animal1 = new Animal("Nina", "Cat", 1, 1.8);

            System.out.println("Name: " + animal1.getName());
            System.out.println("Specie: " + animal1.getSpecie());
            System.out.println("Age: " + animal1.getAge());
            System.out.println("Weight: " + animal1.getWeight() + " kg");

            animal1.growBigger();

            System.out.println("================================");
            System.out.println("After growing bigger...");
            System.out.println("Name: " + animal1.getName());
            System.out.println("Specie: " + animal1.getSpecie());
            System.out.println("Age: " + animal1.getAge());
            System.out.println("Weight: " + animal1.getWeight() + " kg");
        }
    }


