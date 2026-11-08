package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
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
}

