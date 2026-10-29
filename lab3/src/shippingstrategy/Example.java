package shippingstrategy;

public class Example {

    public static void main(String[] args) {

        Product book = new Product("B001", "Java Book", 2.0);
        Product laptop = new Product("L001", "Laptop", 3.0);

        // Test UK shipping
        Basket ukBasket = new Basket(new ShipToUK());
        ukBasket.addProduct(book);
        ukBasket.addProduct(laptop);

        System.out.println("UK shipping: £" + ukBasket.getShippingCharge().getValue());

        // Test European shipping
        Basket europeBasket = new Basket(new ShipToEurope());
        europeBasket.addProduct(book);
        europeBasket.addProduct(laptop);

        System.out.println("Europe shipping: £" + europeBasket.getShippingCharge().getValue());

        // Test Rest of World shipping
        Basket worldBasket = new Basket(new ShipToRestOfWorld());
        worldBasket.addProduct(book);
        worldBasket.addProduct(laptop);

        System.out.println("Rest of World shipping: £" + worldBasket.getShippingCharge().getValue());

        // Test an empty basket
        Basket emptyBasket = new Basket(new ShipToRestOfWorld());

        System.out.println("Empty basket shipping: £" + emptyBasket.getShippingCharge().getValue());
    }
}