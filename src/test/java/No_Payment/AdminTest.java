package No_Payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class AdminTest {
    static Admin admin;

    static Product product1;
    static Product product2;
    static Product product3;

    @BeforeAll
    static void setUp() {
        admin = new Admin("admin");

        product1 = new Product("product1", "group1", 10);
        product2 = new Product("product2", "group2", 20);
        product3 = new Product("product3", "group3", 30);

        admin.addProduct("product1", "group1", 10);
        admin.addProduct("product2", "group2", 20);
        admin.addProduct("product3", "group3", 30);

        Assertions.assertEquals("product1", admin.products.get(0).getName());
        Assertions.assertEquals(3, admin.products.size());

    }



    @Test
    void deleteProduct() {
        admin.deleteProduct(0);
        Assertions.assertEquals(2, admin.products.size());
        Assertions.assertEquals("product3", admin.products.get(1).getName());
    }

    @Test
    void addProduct() {
        admin.addProduct("product4", "group4", 40);
        Assertions.assertEquals(3, admin.products.size());
    }

    @Test
    void modifyProduct() {
        admin.modifyProduct(1, "product5", "group5", 50);
        Assertions.assertEquals(50, admin.products.get(1).getPrice());
    }

    @Test
    void show() {
        Assertions.assertEquals(2, admin.products.size());
        Assertions.assertEquals(50, admin.products.get(0).getPrice());
        Assertions.assertEquals("product3", admin.products.get(1).getName());
    }
}