
package Challenge2;

/**
 * Description: This class represents right triangles.
 * @author David Janusz
 */
public class RightTriangleModel {
    
    /**
     * Gets the hypotenuse.
     * @param legA
     * @param legB
     * @return hypotenuse
     */
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
