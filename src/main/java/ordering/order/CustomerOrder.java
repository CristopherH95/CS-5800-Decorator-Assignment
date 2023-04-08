package ordering.order;

import ordering.interfaces.Order;
import ordering.interfaces.PricedItem;

import java.util.ArrayList;

public class CustomerOrder implements Order {
    private final ArrayList<PricedItem> items;

    public CustomerOrder() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(PricedItem item) {
        items.add(item);
    }

    @Override
    public void removeItem(int itemNumber) {
        int index = itemNumber - 1;
        items.remove(index);
    }

    @Override
    public double getTotal() {
        double total = 0;

        for (PricedItem itemInstance : items) {
            total += itemInstance.getCost();
        }

        return total;
    }

    @Override
    public void printItems() {
        System.out.println("---- CUSTOMER ORDER ----");

        for (int i = 0; i < items.size(); i++) {
            int itemNumber = i + 1;
            PricedItem item = items.get(i);
            System.out.printf("# %d %s%n", itemNumber, item.getDescription());
        }
    }
}
