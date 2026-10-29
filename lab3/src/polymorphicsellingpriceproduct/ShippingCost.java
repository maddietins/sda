package polymorphicsellingpriceproduct;

import java.util.Objects;

public class ShippingCost {
    private final double value;

    public ShippingCost(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Shipping cost cannot be negative");
        }
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShippingCost that = (ShippingCost) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "ShippingCost{" +
                "value=" + value +
                '}';
    }
}
