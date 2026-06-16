package SolidPrinciples.OCP;

// Tax strategy inteface
interface TaxCalculator{
    double calculateTax(double amount);
}

class IndiaTaxCalculator implements TaxCalculator {

    @Override
    public double calculateTax(double amount) {
        return amount * 0.18; // GST
    }

}

class USTaxCalculator implements TaxCalculator{

    @Override
    public double calculateTax(double amount) {
        return amount * 0.08;   // Sales tax
    }

}

class UKTaxCalculator implements TaxCalculator{

    @Override
    public double calculateTax(double amount) {
        return amount * 0.12;   // VAT Tax
    }

}

// Using Dependency Injection
class Invoice{
    private double amount;
    private TaxCalculator taxCalculator;
    public Invoice(double amount) {
        this.amount = amount;
    }

    public Invoice(double amount, TaxCalculator taxCalculator) {
        this.amount = amount;
        this.taxCalculator = taxCalculator;
    }

    public double getTotalAmount() {
        return amount + taxCalculator.calculateTax(amount);
    }

}



public class TaxCalculatorCode {
    public static void main(String[] args) {
        double amount = 1000.0;

        Invoice indiaInvoice = new Invoice(amount,new IndiaTaxCalculator());
        System.out.println("Total(India): " + indiaInvoice.getTotalAmount());

        
    }
}
