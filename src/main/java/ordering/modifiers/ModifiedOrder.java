package ordering.modifiers;

import ordering.interfaces.Order;
import ordering.interfaces.PricedItem;

public abstract class ModifiedOrder implements Order {
    protected Order order;

    public ModifiedOrder(Order order) {
        this.order = order;
    }

    @Override
    public void addItem(PricedItem item) {
        order.addItem(item);
    }

    @Override
    public void removeItem(int itemNumber) {
        order.removeItem(itemNumber);
    }

    @Override
    public void printItems() {
        order.printItems();
    }

    @Override
    public double getTotal() {
        return order.getTotal();
    }
}
