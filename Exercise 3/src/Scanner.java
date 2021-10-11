//Capture of UPC code using a bar scanner
public class Scanner {
    private final CashRegister register;
    private String scannedUpc;
    public Scanner(CashRegister register) {
        this.register = register;
    }
    public String getScannedUpcCode() {
        return scannedUpc;
    }
    //Captures the UPC code read by the scanner.
    public void setScannedUpcCode(String upc) {
        scannedUpc = upc;
        register.setCurrentProductUpc(scannedUpc);
    }
}
