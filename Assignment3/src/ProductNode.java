public class ProductNode {
    private String name;
    private String locator;
    private int amount;
    private double cost;
    private ProductNode next;

    //Constructor # 1
    ProductNode(){
        this.next=null;
        this.name="";
        this.locator="";
        this.amount =0;
        this.cost =0.0;
    }
    //Constructor # 2
    public ProductNode (String name, String locator, int amount, double cost, ProductNode next){
        this.name = name;
        this.locator=locator;
        this.amount =amount;
        this.cost =cost;
        this.next=next;
    }

    public String getName(){
        return name;
    }

    public String getLocator(){
        return locator;
    }

    public int getAmount(){
        return amount;
    }

    public double getCost(){
        return cost;
    }


    public ProductNode getNext(){
        return next;
    }

    public void setName(String name){
        this.name=name;

    }
    public void setLocator(String locator){
        this.locator=locator;

    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    public void setNext(ProductNode next){
        this.next=next;
    }

    @Override
    public String toString() {
        return String.format("Location: %s, Amount: %s, Cost: $%s, Product name: %s", locator, amount, cost, name);
    }


}
