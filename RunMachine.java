public class RunMachine{
    public static void main(String[] args) {

        VendingMachine product = new VendingMachine();

        //Chocolates
        StringBuilder chocolates = new StringBuilder("CHOCOLATES");
        chocolates.append("\n" + "1. Lunch Bar: ");
        System.out.println(chocolates);
        Chocolate bar = new Chocolate("Bar One");
        product.addStock(bar, 0);
        product.buy(bar);
        product.buy(bar);
        System.out.println(">>>>" + " " + product.getChocolateCount() + " chockies left");
        System.out.println();

        //Salty Snacks
        StringBuilder saltySnacks = new StringBuilder("SALTY SNACKS");
        saltySnacks.append("\n" + "1. Pretzel");
        System.out.println(saltySnacks);
        SaltySnack snack = new SaltySnack("Pretzels");
        product.addStock(snack, 0);
        product.buy(snack);
        System.out.println(">>> " + product.getSaltySnackCount() + " snacks left");
        System.out.println();

        //Soft Drinks
        StringBuilder buildSoftDrink = new StringBuilder("COOL DRINKS");
        buildSoftDrink.append("\n" + "1. Low sugar Sprite: ");
        System.out.println(buildSoftDrink);
        SoftDrink coke = new SoftDrink("Low sugar Sprite");
        product.addStock(coke, 0);
        product.buy(coke);
        product.buy(coke);
        System.out.println(">>> " + product.getSoftDrinkCount() + " drinks left");
        System.out.println();

        //Total Number of products in stock.
        StringBuilder totProducts = new StringBuilder("Total stock for all Products");
        totProducts.append("\n").append(product.totalStockCount());
        System.out.println(totProducts);
        System.out.println();

        //Testing Invalid Products
        try {
            StringBuilder builder = new StringBuilder("COOL DRINKS");
            builder.append("\n" + "1. Zero Coke: ");
            SoftDrink sprite = new SoftDrink("Zero Cocoa Cola");
            product.buy(null);
            System.out.println(builder);
            System.out.print(sprite.totalStockCount());
        }catch (InvalidProductException e){
            System.out.println("ERROR: " +"\033[3mSpecified product not available\033[0m");
        }
    }
}