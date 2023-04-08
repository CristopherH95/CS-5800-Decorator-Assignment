package ordering.addons;

import ordering.interfaces.PricedItem;

public class Cheese extends AddOn {
    public Cheese(PricedItem item) {
        super(item);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }

    @Override
    protected String getInclusion() {
        return super.getInclusion() + "cheese";
    }
}
