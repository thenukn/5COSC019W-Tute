package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product
        implements Discountable{
    private double dimensions;
    private String weightKG;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price, double dimensions, String weightKG){
        super(id, name, price);
        this.dimensions=dimensions;
        this.weightKG=weightKG;
    }

    public double getDimensions(){
        return dimensions;
    }

    public String getWeightKG(){
        return weightKG;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | weight: " + weightKG;
    }

    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        double capped =Math.min(rate,0.20);
        discountedPrice = getPrice()*(1-capped);

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}

