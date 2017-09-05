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
public class MountainBikeService extends BasicService {
    
    public MountainBikeService () {
        
    }
    
    //overload - možnosti bicycle a mountainBike
    public void accept (MountainBike mountainBike) {
        if (mountainBike instanceof MountainBike) {
            System.out.println("fixing mountainbike");
        }
    }
}
