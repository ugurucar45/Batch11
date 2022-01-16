package inheritance;

public class Lion extends WildAnimal{
    @Override
    public WildAnimal run() {
        super.run();
    return new Lion();}
}
