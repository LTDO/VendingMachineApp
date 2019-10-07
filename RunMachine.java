public class RunMachine{
    public static void main(String[] args) {

        VendingMachine product = new VendingMachine();

        //Chocolate
        StringBuilder chocolates = new StringBuilder("CHOCOLATES");
        chocolates.append("\n" + "1. Lunch Bar: ");
        System.out.println(chocolates);
        Chocolate bar = new Chocolate("Bar One");
        product.addStock(bar, 0);
        product.buy(bar);
        System.out.println(">>>>" + " " + product.getChocolateCount() + " chockies left");
        System.out.println();

        //Salty Snack
        StringBuilder saltySnacks = new StringBuilder("SALTY SNACKS");
        saltySnacks.append("\n" + "1. Pretzel");
        System.out.println(saltySnacks);
        SaltySnack snack = new SaltySnack("Pretzels");
        product.addStock(snack, snack.getSaltySnackCount());
        product.buy(snack);
        System.out.println(">>> " + snack.getSaltySnackCount() + " snacks left");
        System.out.println();


        //Soft Drink
        StringBuilder buildSoftDrink = new StringBuilder("COOL DRINKS");
        buildSoftDrink.append("\n" + "1. Low sugar Sprite: ");
        System.out.println(buildSoftDrink);
        SoftDrink coke = new SoftDrink("Low sugar Sprite");
        product.addStock(coke, coke.getSoftDrinkCount());
        product.buy(coke);
        product.buy(coke);
        System.out.println(">>> " + coke.getSoftDrinkCount() + " drinks left");
        System.out.println();

        StringBuilder totProducts = new StringBuilder("Total stock for all Products");
        totProducts.append("\n").append(product.totalStockCount());
        System.out.println(totProducts);

        //Testing Invalid Product
        StringBuilder builder = new StringBuilder("COOL DRINKS");
        builder.append("\n" + "1. Zero Coke: ");
        SoftDrink sprite = new SoftDrink("Zero Cocoa Cola");
        product.buy(null);
        System.out.println(builder);
        System.out.print(sprite.totalStockCount());
    }
}