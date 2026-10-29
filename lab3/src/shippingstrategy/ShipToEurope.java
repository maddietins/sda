package shippingstrategy;

import java.util.List;
import polymorphicsellingpriceproduct.ShippingCost;

public class ShipToEurope implements ShippingCostStrategy {

    @Override
    public ShippingCost calculate(List<Product> products) {
        double totalWeight = 0.0;

        for (Product product : products) {
            totalWeight += product.getWeight();
        }

        return new ShippingCost(totalWeight * 1.25);
    }
}