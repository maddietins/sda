package polymorphicsellingpriceproduct;

public final class Example {

    public static void run() {
        FullPrice fullPrice = new FullPrice(100.0d);
        MinimumPrice minimumPrice = MinimumPrice.NO_MINIMUM;
        ShippingCost shippingCost = new ShippingCost(3.99);
        Product product = new Product(fullPrice, minimumPrice, shippingCost);
        System.out.format("Product before discount %s\n", product.getPrice());
        product.applyDiscount(new Discount(5.00));
        System.out.format("Product after discount %s\n", product.getPrice());
        product.removeDiscount();
        System.out.format("Product after remove discount %s\n", product.getPrice());
        System.out.println("Shipping cost: £" + product.getShippingCost().getValue());

        double totalCost = product.getPrice() + product.getShippingCost().getValue();
        System.out.println("Total cost: £" + totalCost);
    }
}
