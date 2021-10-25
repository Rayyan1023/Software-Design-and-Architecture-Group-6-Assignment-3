public class Product {
    //Variables
    private String productname;
    private String productprice;

    //Creating name and price objects
    public Product(String productname, String productprice) {
        this.productname = productname;
        this.productprice=productprice;
    }
    public String GetName() {
        return this.productname;
    }
    public String GetPrice(){
        return this.productprice;
    }
}
