package ordering.items;

import ordering.interfaces.PricedItem;

public class Burger implements PricedItem {
    @Override
    public double getCost() {
        return 2.50;
    }

    @Override
    public String getDescription() {
        return "Burger";
    }
}
