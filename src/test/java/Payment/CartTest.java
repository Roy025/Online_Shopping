package Payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    static Cart cart1;
    static Cart cart2;

    static Product product1;
    static Product product2;
    @BeforeAll
    static void setUp() {
        cart1 = new Cart(1);
        cart2 = new Cart(2);

        product1 = new Product("Carrot", "Vagetable", 10);
        product2 = new Product("Fan", "Elactronics", 50);

        cart1.addProduct(product1);
        cart1.addProduct(product2);

    }

    @Test
    void addProduct() {
        cart1.addProduct(product2);
        Assertions.assertEquals(2, cart1.products.size());
    }

    @Test
    void viewFullCart() {
        Assertions.assertEquals(1, cart1.ViewFullCart().size());
    }

    @Test
    void viewtotalPrice() {
        Assertions.assertEquals(60, cart1.viewtotalPrice());
    }

    @Test
    void removeProduct() {
        cart1.removeProduct(1);
        Assertions.assertEquals(1, cart1.products.size());
        Assertions.assertEquals("Carrot", cart1.products.get(0).getName());
    }
}