package shippingstrategy;

import java.util.ArrayList;
import java.util.List;
import polymorphicsellingpriceproduct.ShippingCost;

public class Basket {
    private final List<Product> products = new ArrayList<>();
    private ShippingCostStrategy shippingStrategy;

    public Basket(ShippingCostStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double totalWeight() {
        double totalWeight = 0.0;

        for (Product product : products) {
            totalWeight += product.getWeight();
        }

        return totalWeight;
    }

    public ShippingCost getShippingCharge() {
        return shippingStrategy.calculate(products);
    }
}
