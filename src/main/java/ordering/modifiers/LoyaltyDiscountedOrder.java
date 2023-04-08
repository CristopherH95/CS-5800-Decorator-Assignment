package ordering.modifiers;

import ordering.interfaces.Order;

public class LoyaltyDiscountedOrder extends ModifiedOrder {
    public LoyaltyDiscountedOrder(Order order) {
        super(order);
    }

    @Override
    public double getTotal() {
        return applyDiscount(super.getTotal());
    }

    private double applyDiscount(double originalTotal) {
        double discountMultiplier = getDiscountPercent() / 100;
        double discountAmount = originalTotal * discountMultiplier;
        return originalTotal - discountAmount;
    }

    private double getDiscountPercent() {
        return 10;
    }

    @Override
    public void printItems() {
        super.printItems();
        System.out.printf("** %.2f%% DISCOUNT **%n", getDiscountPercent());
    }
}
