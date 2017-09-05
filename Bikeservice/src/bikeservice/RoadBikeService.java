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
public class RoadBikeService extends BasicService {
    
    public RoadBikeService () {
        
    }
    
    //overload - možnosti bicycle a roadBike
    public void accept (RoadBike roadBike) {
        if (roadBike instanceof RoadBike) {
            System.out.println("fixing roadbike");
        }
    }
}
