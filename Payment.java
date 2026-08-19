public class Payment {
    void Pay(int amount){
        System.out.println("Payment Method: "+ payment);
        System.out.println("Amount: "+amount);
    }
}
class CreaditCard extends Payment{
    void Pay(int amount){
        System.out.println("Payment method: "+ CreaditCard);
        System.out.println("Amount: "+ amount);
    }
}
class UPI extends Payment{
    void Pay(int amount){
        System.out.println("Payment Method: "+ UPI);
        System.out.println("Amount: "+ amount);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         int choice = nextInt();
         int amount = nextInt();

         Payment payment;

         if(choice == 1){
            Payment = new CreditCard();
         }
         else {
            Payment = new UPI();
         }

         payment.Pay(amount);
    }
}
