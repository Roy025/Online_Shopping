package No_Payment;

public class Product {
    private int id;
    public static int i = 0;
    private String name;
    private String group;
    private int price;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Product(String name, String group, int price) {
        this.id = i++;
        this.name = name;
        this.group = group;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}