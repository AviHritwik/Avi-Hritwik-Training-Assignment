/**
 * Implemented all methods of abstract Animal class
 * So, it can be a non abstract class
 */
public class Carnivores extends Animal{

    @Override
    String eat(String food) {
        return new String("Eats "+food);
    }

    @Override
    String preyOrPredator() {
        return "Predator";
    }
}
