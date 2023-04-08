package ordering.items;

import ordering.interfaces.PricedItem;

public class Drink implements PricedItem {
    @Override
    public double getCost() {
        return 1.00;
    }

    @Override
    public String getDescription() {
        return "Drink";
    }
}
