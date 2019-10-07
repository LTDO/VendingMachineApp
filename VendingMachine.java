public class VendingMachine {

    public int stockCount = 0;
    public int softDrinkCount;
    public int saltySnackCount;
    public int chocolateCount;

    VendingMachine(int softDrinkCount, int saltySnackCount, int chocolateCount) {
        this.softDrinkCount = softDrinkCount;
        this.saltySnackCount = saltySnackCount;
        this.chocolateCount = chocolateCount;
    }

    VendingMachine(){
        this(5,5,5);
    }

    //ADD STOCK
    public void addStock(Product prod, int newStock) {

        if(prod instanceof Chocolate){
            chocolateCount += newStock;
        }
        else if(prod instanceof SoftDrink){
            softDrinkCount += newStock;
        }
        else if(prod instanceof SaltySnack){
            saltySnackCount += newStock;
        }
        else{
            stockCount += newStock;
            throw new ProductNotFoundException();
        }
    }

    //BUY METHOD
    public void buy(Product product) throws InvalidProductException, ProductNotFoundException {
        if(product != null) {
            if (product instanceof SoftDrink) {
                if (softDrinkCount <= 0) {
                    throw new SoftDrinkNotFoundException();
                } else {
                    softDrinkCount--;
                    stockCount--;
                }
            } else if(product instanceof Chocolate){
                if(chocolateCount <= 0){
                    throw new ChocolateNotFoundException();
                }else{
                    chocolateCount--;
                    stockCount--;
                }
            }
            else if(product instanceof SaltySnack){
                if (saltySnackCount <= 0){
                    throw new SoftDrinkNotFoundException();
                } else{
                    saltySnackCount--;
                    stockCount--;
                }
            }
            else{
                throw new ProductNotFoundException();
            }
        } else {
            throw new InvalidProductException();
        }
    }

    //GET STOCK
    public int totalStockCount() {
        return  softDrinkCount + saltySnackCount + chocolateCount;
     }
     public int getSoftDrinkCount(){
        return softDrinkCount;
     }
    public int getChocolateCount(){
        return chocolateCount;
    }
    public int getSaltySnackCount(){
        return saltySnackCount;
    }
}