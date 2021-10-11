//Is a graphical display of scanned or manually entered item name and price
public class Display implements ObserverRegister  {
    public void Display() {

    }

    //Displays some text on the screen.
    @Override
    public void updatedProduct(Product product) {
        System.out.println("Display: The product was added "" + product.GetName() + "".");
    }
}
