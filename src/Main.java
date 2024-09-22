public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 350.25;
        double salesTax = 0;
        final double TAX_RATE = .05;

        salesTax = purchasePrice * TAX_RATE;

        System.out.println("the sales tax on a purchase of " + purchasePrice + " is " + salesTax);
    }
}