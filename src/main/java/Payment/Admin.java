package Payment;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    public static int i = 0;
    private String name;
    private int id;

    public Admin(String name) {
        this.id = ++i;
        this.name = name;
    }
    public List<Product> products = new ArrayList<Product>();

    public void addProduct(String name, String group, int price) {
        Product product = new Product( name, group, price);
        products.add(product);
        show();
        System.out.println("S");
    }

    public void deleteProduct(int id) {
        products.remove(id);
        System.out.println("S");
    }

    public void modifyProduct(int id, String name, String group, int price) {
        Product product = products.get(id);
        product.setName(name);
        product.setGroup(group);
        product.setPrice(price);
        System.out.println("S");
    }

    public List<Product> show() {
        for (Product p : products) {
            System.out.println(p.getId()+"."+ p.getGroup()+" : "+p.getName()+" => "+p.getPrice());
        }
        return products;
    }

}