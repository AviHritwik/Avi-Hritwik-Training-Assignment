public class Assignment2Q4 {
    public static void main(String[] args) {
        Cow cow=new Cow();  //Multi-level inheritance with two abstract class- Animal and Herbivores
        Lion lion=new Lion();   //Multi-level inheritance with one abstract class- Animal and Carnivores
        GoldFish goldFish=new GoldFish();
        System.out.println("Cow details:");
        System.out.println("\t"+cow.eat("Grass"));
        System.out.println("\t"+cow.preyOrPredator());
        System.out.println("\t"+cow.sound());
        System.out.println("lion Details: ");
        System.out.println("\t"+lion.eat("Meat"));
        System.out.println("\t"+lion.preyOrPredator());
        System.out.println("\t"+lion.sound());
        System.out.println("Gold Fish details : ");
        System.out.println("\t"+goldFish.move());
        System.out.println("\t"+goldFish.livesIn());
    }
}
