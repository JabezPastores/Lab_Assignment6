public class InvoiceGeneratorImpl implements InvoiceGenerator{

    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice Generated: " + fileName);
    }
}
