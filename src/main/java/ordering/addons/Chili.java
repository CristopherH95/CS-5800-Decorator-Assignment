package ordering.addons;

import ordering.interfaces.PricedItem;

public class Chili extends AddOn {
    public Chili(PricedItem item) {
        super(item);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }

    @Override
    protected String getInclusion() {
        return super.getInclusion() + "chili";
    }
}
