package OOPabstraction;
public class BasicAb_ {
    public static void main(String[] args){
        // Abstract class cannot be instantiated
        // Abstract class can have abstract and non-abstract methods
        // Abstract method does not have a body and must be implemented by subclasses

        // Example of an abstract class
        @SuppressWarnings("unused")
        abstract class Music {
                       
            void play() {
                System.out.println("Playing music");
            }
        }

        // Subclass that extends the abstract class
        class Dog extends Animal {
            void sound() {
                System.out.println("Dog barks");
            }

          
        }

        // Creating an instance of the subclass
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
      
    }

    private static class Animal {

        public Animal() {
        }
    }
    
}
