public class TiramisuClient {
    public static void main(String[] args) {
        Tiramisu tiramisu = new BasicTiramisu();

        tiramisu = new ChocolateTiramisu(tiramisu);

        System.out.println(tiramisu.getDescription() + " costs $" + tiramisu.cost());
    }
}

