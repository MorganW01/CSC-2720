//Morgan Warren
/* CSC 2720 Assignment 3
* Section 018
* 4/21/2021
* */



public class InventoryTester {
    //Driver Code
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();
        // add products to inventory
        inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "box256", 10, 699.80);
        inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "shelf4", 4, 699.80);
        inventory.addProduct("Apple macbook pro ", "box15", 2, 1500.87);
        inventory.addProduct("Dell Monitor", "shelf10", 12, 221.54);
        inventory.showInventory();
        System.out.println(inventory.countProduct("Apple iphone 7 plus 32gb rose gold"));// should return 14
        System.out.println(inventory.countNeededAmount("Dell Monitor", 15));// Should return 3
        inventory.removeProduct("Apple iphone 7 plus 32gb rose gold", "shelf4");
        System.out.println(inventory.getTotalAmount()); // should return 12
    }

}