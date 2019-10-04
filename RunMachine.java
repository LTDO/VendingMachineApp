public class RunMachine{
    public static void main(String[] args) {

        VendingMachine product = new VendingMachine();

        //Chocolate
        Chocolate bar = new Chocolate("Bar One");
        product.addStock(bar, 0);
        product.buy(bar);
        System.out.println(product.getStock());

        //Soft Drinks
        SoftDrink coke = new SoftDrink("Cocoa Cola");
        product.addStock(coke, 0);
        product.buy(coke);
        System.out.println(product.getStock());

        //Salty  Snack
        SaltySnack snack = new SaltySnack("Snacks");
        product.addStock(snack, 0);
        product.buy(snack);
        System.out.println(product.getStock());
    }
}