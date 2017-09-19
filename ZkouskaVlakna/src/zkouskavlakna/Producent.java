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
public class Producent implements Runnable {

    Zasobnik zas;

    public Producent(Zasobnik zas) {
        this.zas = zas;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            double cislo = (Math.random() * 10);
            zas.ulozDoZasobniku(i + ": " + cislo);
        }
    }
}
