package Payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayTest {
    static Pay payment;
    static Product product1;

    static Cart cart;

    @BeforeAll
    static void setUp() {
        payment = new Pay();

        product1 = new Product("Carrot", "Vagetable", 10);

        cart = new Cart(1);
        cart.addProduct(product1);
        cart.viewtotalPrice();

    }
    @Test
    void makePayment() {
        Assertions.assertEquals(0, payment.makePayment(0, "Credit", "12345678"));
        Assertions.assertEquals(10, payment.makePayment(10,"Credit", "123456"));
    }

}