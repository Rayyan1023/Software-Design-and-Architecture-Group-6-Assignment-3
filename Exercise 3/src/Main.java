//Rayyan Mohammed 100752351

//Daniyal Khan 100750029

//Muhammad Khalid 100746801

public class Main {

    public static void main(String[] args) {
        // Create a ProductDB with sample data
        ProductDB productDB = new ProductDB();
        //Output product test with random upc number
        productDB.addProductInfo("UPC321654876", new Product("Test Product"));

        // Initialize the CashRegister and its Scanner
        CashRegister register = new CashRegister(productDB);
        register.inputObserver(new Display());
        register.inputObserver(new TicketPrinter());

        Scanner scanner = new Scanner(register);
        scanner.setScannedUpcCode("UPC321654876");//Sets sample data to scanned code
    }
}
