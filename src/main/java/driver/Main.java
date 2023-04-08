package driver;

import ordering.addons.Cheese;
import ordering.addons.Chili;
import ordering.interfaces.Order;
import ordering.interfaces.PricedItem;
import ordering.items.Burger;
import ordering.items.Drink;
import ordering.items.Fries;
import ordering.modifiers.LoyaltyDiscountedOrder;
import ordering.order.CustomerOrder;

public class Main {
    public static void main(String[] args) {
        testBasicOrder();
        testOrderAddOns();
        testLoyaltyDiscount();
    }

    private static void testBasicOrder() {
        System.out.println("BASIC ORDER TEST:");
        Burger burger = new Burger();
        Fries fries = new Fries();
        Drink drink = new Drink();
        CustomerOrder order = makeCustomerOrder(burger, fries, drink);

        order.printItems();
        System.out.printf("Total: $%.2f%n", order.getTotal());
    }

    private static void testOrderAddOns() {
        System.out.println("ORDER ADD-ONS TEST:");
        PricedItem cheeseBurger = new Cheese(new Burger());
        PricedItem chiliFries = new Chili(new Fries());
        Drink drink = new Drink();
        CustomerOrder order = makeCustomerOrder(cheeseBurger, chiliFries, drink);

        order.printItems();
        System.out.printf("Total: $%.2f%n", order.getTotal());
    }

    private static void testLoyaltyDiscount() {
        System.out.println("LOYALTY DISCOUNTED ORDER:");
        Burger burger = new Burger();
        Fries fries = new Fries();
        Drink drink = new Drink();
        Order order = new LoyaltyDiscountedOrder(makeCustomerOrder(burger, fries, drink));

        order.printItems();
        System.out.printf("Total: $%.2f%n", order.getTotal());
    }

    private static CustomerOrder makeCustomerOrder(PricedItem... items) {
        CustomerOrder customerOrder = new CustomerOrder();

        for (PricedItem itemInstance : items) {
            customerOrder.addItem(itemInstance);
        }

        return customerOrder;
    }
}