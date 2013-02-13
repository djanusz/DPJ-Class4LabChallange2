
package Challenge2;

/**
 * Description: This class represents a rectangle. 
 * @author David Janusz
 */
public class RectangleModel {
    
    /**
     * Gets the area of the rectangle.
     * @param length
     * @param width
     * @return area of the rectangle.
     */
    public double getArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Value must be greater "
                    + "than zero!");
        }
        
        double area = length * width;
        return area;
    }
}
