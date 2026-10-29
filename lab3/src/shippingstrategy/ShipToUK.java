package shippingstrategy;

import polymorphicsellingpriceproduct.ShippingCost;
import polymorphicsellingpriceproduct.ShippingCost;
import java.util.List;

public class ShipToUK implements ShippingCostStrategy {

    @Override
    public ShippingCost calculate(List<Product> products) {
        return new ShippingCost(0.0);
    }
}
