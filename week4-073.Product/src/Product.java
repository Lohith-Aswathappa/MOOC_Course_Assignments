public class Product {
    private double price;
    private int amount;
    private String name;

    public Product(String nameAtStart, double priceAtStart, int amtAtStart){
        this.name = nameAtStart;
        this.amount = amtAtStart;
        this.price = priceAtStart;
    }
    public void printProduct(){
        System.out.println(this.name + ", " + "price " + this.price + ", amount " + this.amount);
    }
}
