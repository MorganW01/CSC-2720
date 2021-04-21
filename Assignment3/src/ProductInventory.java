public class ProductInventory {

    ProductNode inventoryHead;


    public void showInventory() {
        if (inventoryHead == null) {
            throw new ProductException("Inventory is empty");
        }
        ProductNode temp = inventoryHead;
        while (temp.getNext() != null) {
            System.out.println(temp.toString());
            temp = temp.getNext();
        }
    }


    public int getTotalAmount() {
        int totalAmount = 0;
        ProductNode temp = inventoryHead;
        if (temp == null) {
            throw new ProductException("Inventory is empty");
        }
        while (temp.getNext() != null) {
            totalAmount += temp.getAmount();
            temp = temp.getNext();
        }
        return totalAmount;
    }


    public ProductNode removeMaximum() {
        ProductNode current = inventoryHead;
        ProductNode maxNode = null;
        int max;

        if (inventoryHead == null) {
            throw new ProductException("Inventory is empty");
        }
        else {
            // Initializing max with head node data
            max = current.getAmount();
            maxNode = current;

            while (current != null) {
                // If current node's data is greater than max
                // Then, replace value of max with current node's data
                if (max < current.getAmount()) {
                    max = current.getAmount();
                    maxNode = current;
                }
                current = current.getNext();
            }
            if (maxNode != null) {
                removeProduct(maxNode.getName(), maxNode.getLocator());
            }
        }
        return maxNode;
    }


    public void sortInventory() {
        ProductNode sortedNode = null;
        while (inventoryHead != null) {
            ProductNode removedMaximum = removeMaximum();
            if (sortedNode == null) {
                sortedNode = removedMaximum;
            }
            else {
                ProductNode last = sortedNode;
                while (last.getNext() != null) {
                    last = last.getNext();
                }
                last.setNext(removedMaximum);
            }
        }
        inventoryHead = sortedNode;
    }


    public void addProduct(String productName, String locator, int amount, double cost) {
        ProductNode node = new ProductNode(productName, locator, amount, cost, null);
        validateProduct(node);
        if (inventoryHead == null) {
            inventoryHead = node;
        }
        else {
            ProductNode last = inventoryHead;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }
    }


    @SuppressWarnings("unused")
    public void removeProduct(String productName, String locator) {
        ProductNode current = inventoryHead;
        ProductNode pervious = null;
        while (current != null) {
            if (locator.equalsIgnoreCase(current.getLocator()) && productName.equalsIgnoreCase(current.getName())) {
                break;
            }
            pervious = current;
            current = current.getNext();
        }
        if (current != null) {
            if (pervious != null) {
                ProductNode next = current.getNext();
                pervious.setNext(next);
            }
            current = pervious;
        }
    }


    public int countProduct(String productName) {
        int count = 0;
        ProductNode node = inventoryHead;
        while (node != null) {
            if (productName.equalsIgnoreCase(node.getName())) {
                count += node.getAmount();
            }
            node = node.getNext();
        }
        return count;
    }


    public int countNeededAmount(String productName, int neededAmount) {
        int productAmount = countProduct(productName);
        return neededAmount - productAmount;
    }


    private void validateProduct(ProductNode node) {
        ProductNode product = getProduct(node.getLocator(), node.getName());
        if (product != null) {
            throw new ProductException("Product already exists in the inventory");
        }
        if (node.getCost() < 0 || node.getAmount() < 0) {
            throw new ProductException("Invalid Input");
        }
    }


    private ProductNode getProduct(String locator, String name) {
        ProductNode node = inventoryHead;
        while (node != null && !(locator.equalsIgnoreCase(node.getLocator()) && name.equalsIgnoreCase(node.getName()))) {
            node = node.getNext();
        }
        return node;
    }
}