package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is still something the shop sells,
// with an id, a name and a price, and it just also has to be shipped.
// A ShoppingCart would NOT pass this test: a cart contains products, it is not a product itself (HAS-A, not IS-A).

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {}
    

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";

    }


    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
