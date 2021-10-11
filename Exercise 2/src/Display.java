//Is a graphical display of scanned or manually entered item name and price
public class Display implements ViewRegister  {
    public void Display() {

    }

    //Displays text on screen.
    @Override
    public void displayProduct(Product product) {
        //Outputs display when called
        System.out.println("Display: The product was added "" + product.GetName() + "".");
    }
}
