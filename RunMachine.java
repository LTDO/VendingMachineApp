public class RunMachine{

    public static void main(String[] args) {


        VendingMachine product = new VendingMachine();
//        SoftDrink coke = new SoftDrink("Sprite");
//        product.addStock(coke, 0);
//        product.buy(coke);

        //Chocolates
        Chocolate barOne = new Chocolate("Energy Bar");
        product.addStock(barOne, 0);
        product.buy(barOne);
        product.buy(barOne);
        System.out.println(barOne.getStock());
    }
}