//Capture of UPC code using a bar scanner
public class Scanner {
    //variables
    private String scannedUpc;
    private final CashRegister scan;

    //Creats object
    public Scanner(CashRegister scan) {
        this.scan = scan;
    }
    //Captures the UPC code read by the scanner.
    public void ScannedUpcCode(String upc) {
        scannedUpc = upc;
        scan.setCurrentProductUpc(scannedUpc);
    }
    //Gets scanned upc
    public String getScannedUpcCode() {
        return scannedUpc;
    }
}
