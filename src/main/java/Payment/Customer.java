package Payment;

public class Customer {

    public static int i = 0;
    private int id;
    public String name;
    public Cart cart;
    public Pay payment;
    public Customer(int id, String name) {
        id = ++i;
        this.name = name;
        payment = new Pay();
        cart = new Cart(id);
    }
}
