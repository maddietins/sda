package shippingstrategy;

import java.util.List;
import polymorphicsellingpriceproduct.ShippingCost;

public class ShipToRestOfWorld implements ShippingCostStrategy {

    @Override
    public ShippingCost calculate(List<Product> products) {
        if (products.isEmpty()) {
            return new ShippingCost(0.0);
        }

        double totalWeight = 0.0;

        for (Product product : products) {
            totalWeight += product.getWeight();
        }

        double cost = Math.max(10.00, totalWeight * 5.50);

        return new ShippingCost(cost);
    }
}