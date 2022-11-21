package Payment;

public class Pay {
    String cardName;
    String cardNum;
    Pay(){}
    public Pay(String cardName, String cardNum) {
        this.cardName = cardName;
        this.cardNum = cardNum;
    }
    public int makePayment(int price ,String cardName, String cardNum)
    {
        System.out.println("Paymatent made "+ price +"tk using "+cardName+" - "+cardNum);
        return price;
    }
}
