//Rayyan Mohammed 100752351

//Daniyal Khan 100750029

//Muhammad Khalid 100746801


public class Main {

    public static void main(String[] args) {
        ProductDB productDatabase = new ProductDB();
        //Calling Scanner and Cash register objects
        CashRegister register = new CashRegister(productDatabase);
        // Calls the added observers
        register.inputObserver(new Display());
        register.inputObserver(new TicketPrinter());
        Scanner scanner = new Scanner(register);

        //Output product test with random upc number
        productDatabase.storedProduct("321654876", new Product("Chocolate Milk","10.59"));

        //Sets sample data to scanned code
        scanner.ScannedUpcCode("321654876");
    }
}
