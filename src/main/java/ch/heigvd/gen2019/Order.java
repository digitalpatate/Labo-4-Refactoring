package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("{");
        sb.append("\"id\": ");
        sb.append(id);
        sb.append(", ");
        sb.append("\"products\": [");

        for (Product product : products) {
            sb.append(product).append(", ");
        }

        if (!products.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}");

        return sb.toString();
    }
}
