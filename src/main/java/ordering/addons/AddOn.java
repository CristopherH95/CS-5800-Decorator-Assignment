package ordering.addons;

import ordering.interfaces.PricedItem;

public abstract class AddOn implements PricedItem {
    protected PricedItem item;

    public AddOn(PricedItem item) {
        this.item = item;
    }

    @Override
    public double getCost() {
        return item.getCost();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + System.lineSeparator() + getInclusion();
    }

    protected String getInclusion() {
        return "---->";
    }
}
