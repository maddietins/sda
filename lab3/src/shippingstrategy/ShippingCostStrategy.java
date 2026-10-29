package shippingstrategy;

import java.util.List;
import polymorphicsellingpriceproduct.ShippingCost;

public interface ShippingCostStrategy {
    ShippingCost calculate(List<Product> products);
}
