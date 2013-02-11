
package Challenge2;

/**
 *
 * @author David Janusz
 */
public class PythagoreanModel {
    
    public double getHypotenuse(double legA, double legB) {
        if (legA <= 0 || legB <= 0) {
            throw new IllegalArgumentException("Value must be greater "
                    + "than zero!");
        }
        
        double hypotenuseSquared = (legA * legA) + (legB * legB);
        double hypotenuse = Math.sqrt(hypotenuseSquared);
        return hypotenuse;
    }
}
