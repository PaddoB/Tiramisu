public abstract class TiramisuDecorator implements Tiramisu{
    protected Tiramisu tiramisu;

    public TiramisuDecorator(Tiramisu tiramisu) {
        this.tiramisu = tiramisu;
    }

    public String getDescription() {
        return tiramisu.getDescription();
    }

    public double cost() {
        return tiramisu.cost();
    }
}


