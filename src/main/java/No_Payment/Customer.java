package No_Payment;

import Payment.Pay;

public class Customer {

    public static int i = 0;
    private int id;
    public String name;
    public Cart cart;
    public Customer(int id, String name) {
        id = ++i;
        this.name = name;
        cart = new Cart(id);
    }
}
