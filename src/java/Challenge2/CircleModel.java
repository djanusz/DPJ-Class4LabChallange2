
package Challenge2;

/**
 * Description: This class represents a circle. 
 * @author David Janusz
 */
public class CircleModel {
    
    
    /**
     * Gets the area of the circle.
     * @param radius
     * @return area of the circle
     */
    public double getArea(double radius) {
        if (radius <= 0 ) {
            throw new IllegalArgumentException("Value must be greater "
                    + "than zero!");
        } 
                
        double area = Math.PI * radius * radius;
        return area;
    }
}
