package ordering.interfaces;

public interface Order {
    void addItem(PricedItem item);
    void removeItem(int itemNumber);
    void printItems();
    double getTotal();
}
