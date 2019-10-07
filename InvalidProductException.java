public class InvalidProductException extends RuntimeException{
    public InvalidProductException(){
        System.out.println("Opp's your product is not available at this moment");
    }
}