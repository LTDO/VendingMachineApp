public class RunMachine{

    public static void main(String[] args) {

        VendingMachine product = new VendingMachine();

        //Chocolates
        Chocolate barOne = new Chocolate("Energy Bar");
        product.addStock(barOne, 1);
        product.buy(barOne);
        System.out.println(barOne.getStock());

        //SoftDrinks
        SoftDrink coke = new SoftDrink("Coke");
        product.addStock(coke, 1);
        product.buy(coke);
        System.out.println(coke.getStock());

        //Salty Snacks
        SaltySnack snack = new SaltySnack("Simba");
        product.addStock(snack, 2);
        product.buy(snack);
        System.out.println(snack.getStock());
    }
}