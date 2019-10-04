public class VendingMachine {

    public int stockCount = 0;
    int softDrinkCount = 0;
    int saltySnackCount = 0;
    int chocyCount = 0;

    VendingMachine(int softDrinkCount, int saltySnackCount, int chocyCount) {
        this.softDrinkCount = softDrinkCount;
        this.saltySnackCount = saltySnackCount;
        this.chocyCount = chocyCount;
    }

    VendingMachine(){
        this(5,5,5);
    }

    //BUY METHOD
    public void buy(Product product) throws InvalidProductException {
        if(product instanceof  Product) {
            if (product instanceof SoftDrink) {
                if (softDrinkCount < 0) {
                    throw new SoftDrinkNotFoundException();
                } else {
                    softDrinkCount--;
                    stockCount--;
                }
            } else if(product instanceof Chocolate){
                if(chocyCount < 0){
                    throw new ChocolateNotFoundException();
                }else{
                    chocyCount--;
                    stockCount--;
                }
            }
            else if(product instanceof SaltySnack){
                if (saltySnackCount < 0){
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

    //ADD STOCK
    public void addStock(Product prod, int newStock) {

        if(prod instanceof Chocolate){
            chocyCount += newStock;
        }
        else if(prod instanceof SoftDrink){
            softDrinkCount += newStock;
        }
        else if(prod instanceof SaltySnack){
            saltySnackCount += newStock;
         }
        else{
            stockCount += newStock;
          }
        }

    //GET STOCK
    public int getStock() {
        return stockCount;
     }
}