/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge2;

/**
 *
 * @author David
 */
public class PythagoreanModel {
    
    public double getHypotenuse(double legA, double legB) {
        double hypotenuseSquared = (legA * legA) + (legB * legB);
        double hypotenuse = Math.sqrt(hypotenuseSquared);
        return hypotenuse;
    }
}
