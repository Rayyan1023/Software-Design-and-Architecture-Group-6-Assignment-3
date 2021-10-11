//Prints on paper the scanned or manually entered item name and price
public class TicketPrinter implements ViewRegister {
    public void TicketPrinter() {

    }

    //Prints some text on the paper.
    @Override
    public void displayProduct(Product product) {
        //Outputs display when called
        System.out.println("TicketPrinter: The product was added "" + product.GetName() + "".");
    }
}

