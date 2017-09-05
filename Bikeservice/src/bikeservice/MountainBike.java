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
public class MountainBike extends Bicycle {
    //nějaké další atributy?
    
    public MountainBike (String brand, String type) {
      super (brand, type);
      this.type = "Mountain";
    }
}
