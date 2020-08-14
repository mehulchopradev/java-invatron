import com.abc.geometry.Rectangle;
import com.abc.geometry.Square;
import com.xyz.ShapeDisplayer;

// Manager Y of the Company abc
public class PlayShapes {

    public static void main(String[] args) {
        Square s1 = new Square(5);

        /* System.out.println(s1.area());
        System.out.println(s1.perimeter()); */

        Rectangle rectangle = new Rectangle(6, 4);

        ShapeDisplayer.displayShape(s1);
        ShapeDisplayer.displayShape(rectangle);
    }
}
