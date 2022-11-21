package No_Payment;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    static List<Product> products = new ArrayList<Product>();

    public Cart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("SS");
    }

    public List<Product> ViewFullCart() {
        for (Product p : products) {
            System.out.println(p.getId()+"."+ p.getGroup()+" : "+p.getName()+" => "+p.getPrice());
        }
        return products;
    }

    public int viewtotalPrice() {
        int price = 0;
        for (Product p : products) {
            price = price + p.getPrice();
        }
        return price ;
    }

    public void removeProduct(int id) {
        products.remove(id);
        System.out.println("ss");
    }
}
