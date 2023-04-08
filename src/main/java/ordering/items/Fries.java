package ordering.items;

import ordering.interfaces.PricedItem;

public class Fries implements PricedItem {
    @Override
    public double getCost() {
        return 1.50;
    }

    @Override
    public String getDescription() {
        return "Fries";
    }
}
