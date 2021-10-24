//Is a graphical display of scanned or manually entered item name and price
//Implements ViewRegister interface
public class Display implements ViewRegister {
    //Displays some text on the screen.
    public void displayProduct(Product product) {
        //Outputs product on display 
        System.out.println("Display: " + product.GetName() + " has been scanned. Price: $" +  product.GetPrice());
    }
}
