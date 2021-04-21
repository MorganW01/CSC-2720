public class InventoryTester {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();
        // Add Products to inventory
        inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "box256", 10, 699.80);
        inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "shelf4", 4, 699.80);
        inventory.addProduct("Apple macbook pro", "box15", 2, 1500.87);
        inventory.addProduct("Dell Monitor", "shelf10", 12, 221.54);
        // Show inventory
        inventory.showInventory();

    }

}
