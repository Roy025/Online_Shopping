package No_Payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    static Product product1;
    static Product product2;

    @BeforeAll
    static void setUp() {
        product1 = new Product("Carrot", "Vagetable", 10);
        product2 = new Product("Fan", "Elactronics", 20);
    }

    @Test
    void getGroup() {
        Assertions.assertEquals("Elactronics", product2.getGroup());
    }

    @Test
    void setGroup() {
        product1.setGroup("Vegies");
        Assertions.assertEquals("Vegies", product1.getGroup());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Carrot", product1.getName());
    }

    @Test
    void setName() {
        product1.setName("Onion");
        Assertions.assertEquals("Onion", product1.getName());
    }

    @Test
    void getPrice() {
        Assertions.assertEquals(20, product2.getPrice());
    }

    @Test
    void setPrice() {
        product1.setPrice(50);
        Assertions.assertEquals(50, product1.getPrice());
    }
}