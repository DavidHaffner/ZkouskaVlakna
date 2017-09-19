/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkouskavlakna;

/**
 *
 * @author DHA
 */
public class Konzument implements Runnable {

    Zasobnik zas;

    public Konzument(Zasobnik zas) {
        this.zas = zas;
    }

    public void run() {
        while (true) {
            String s = zas.vyberZeZasobniku();
            if (s == null) {
                break;
            }
            System.out.println("Konzument " + Thread.currentThread().getName()
                    + " ze zasobniku vybrana hodnota " + s);
        }
    }
}
