package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is still something the shop sells,
// with an id, a name and a price, and it just also has to be shipped.
// A ShoppingCart would NOT pass this test: a cart contains products, it is not a product itself (HAS-A, not IS-A).

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

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


}
