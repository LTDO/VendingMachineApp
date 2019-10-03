public class VendingMachine {

    public static int stockCount = 0;

    public void buy(Product product) throws ProductNotFoundException{

        if(stockCount <= 0){
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