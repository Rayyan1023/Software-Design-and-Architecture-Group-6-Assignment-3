//Is a graphical display of scanned or manually entered item name and price
//Implements ObserverRegister interface
public class Display implements ObserverRegister {
    //Displays some text on the screen.
    public void updatedProduct(Product product) {
        //Outputs product on display 
        System.out.println("Display: " + product.GetName() + " has been scanned. Price: $" +  product.GetPrice());
    }
}
