
package Challenge2;

/**
 *
 * @author David Janusz
 */
public class RectangleModel {
    
    public double getArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Value must be greater "
                    + "than zero!");
        }
        
        double area = length * width;
        return area;
    }
}
