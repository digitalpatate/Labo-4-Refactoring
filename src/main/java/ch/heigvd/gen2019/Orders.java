package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (Order order : orders) {
            sb.append(order).append(", ");
        }

        if (!orders.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}
