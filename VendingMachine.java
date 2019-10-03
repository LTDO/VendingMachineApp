public class VendingMachine {

    public static int stockCount = 0;
    public void buy(Product product) throws ProductNotFoundException{

        if(stockCount <= 0){
            if(product.equals(new ChocolateNotFoundException())){
                throw new ChocolateNotFoundException();
            }
//            else if (product.equals(new SaltySnackNotFoundException())){
//                throw new SaltySnackNotFoundException();
//            }
//            else if(product.equals(new SoftDrinkNotFoundException())){
//                throw new SoftDrinkNotFoundException();
//            }
        }else {
            stockCount--;
        }
    }
    public void addStock(Product product, int newStock) {
        stockCount += newStock;
    }
    public int getStock() {
        return stockCount;
     }
}