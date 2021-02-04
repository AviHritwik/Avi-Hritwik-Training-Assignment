public class Cow extends Herbivores {
    @Override
    public String eat(String food) {
        return new String("Eats "+food);
    }
    public String sound()
    {
        return "Cow Mows";
    }
}
