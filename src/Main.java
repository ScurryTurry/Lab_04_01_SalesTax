public class Main
{
    public static void main(String[] args)
    {
        double salesTax = 0.10;
        double itemPrice = 5.50;
        double totalPrice = 0.00;
        double totalTax = 0.00;

        totalTax = itemPrice * salesTax;
        totalPrice = itemPrice + totalTax;

        System.out.println("The total on an item that cost $" + itemPrice + " with sales tax is $" + totalPrice);

    }
}