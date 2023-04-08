package ordering.addons;

import ordering.interfaces.PricedItem;

public class Onions extends AddOn {
    public Onions(PricedItem item) {
        super(item);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }

    @Override
    protected String getInclusion() {
        return super.getInclusion() + "onions";
    }
}
