/**
 * Not implementing all methods in parent abstract class Animal
 * Class should be abstract
 */
abstract public class Herbivores extends Animal {
    @Override
    public String preyOrPredator() {
        return "Prey";
    }
}
