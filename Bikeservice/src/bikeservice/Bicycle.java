/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeservice;

/**
 *
 * @author DHA
 */
public class Bicycle {
    protected String brand;
    protected String type;
    
    public Bicycle (String brand, String type) {
        this.brand = brand;
        this.type = type;      //varianty general, road a mountain
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString () {
        return ("Bike "+brand+" "+type);
    }
}
