public class ChocolateTiramisu extends TiramisuDecorator{
    public ChocolateTiramisu(Tiramisu tiramisu) {
        super(tiramisu);
    }

    public String getDescription() {
        return tiramisu.getDescription() + ", with chocolate";
    }

    public double cost() {
        return tiramisu.cost() + 4.0;
    }
}

