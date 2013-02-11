
package Challenge2;

/**
 *
 * @author David Janusz
 */
public class CircleModel {
    
    public double getArea(double radius) {
        if (radius <= 0 ) {
            throw new IllegalArgumentException("Value must be greater "
                    + "than zero!");
        } 
                
        double area = Math.PI * radius * radius;
        return area;
    }
}
