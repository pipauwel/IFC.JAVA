package buildingsmart.ifc;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IfcDirectionTest {

    /**
     * Tests whether an object initialized with the varargs constructor is the
     * same as one initialized with the constructor that takes a List as
     * input, provided that the values passed in the varargs constructor are
     * the ones contained in the List.
     */
    @Test
    public void varArgsConstructor() {
        double d0 = 0.1;
        double d1 = 0.3;
        double d2 = 4;
        IfcReal[] directionRatios = new IfcReal[3];
        directionRatios[0] = new IfcReal(d0);
        directionRatios[1] = new IfcReal(d1);
        directionRatios[2] = new IfcReal(d2);
        IfcDirection expectedIfcDirection =
                new IfcDirection(Arrays.asList(directionRatios));

        IfcDirection ifcDirection = new IfcDirection(d0, d1, d2);

        assertEquals(expectedIfcDirection, ifcDirection);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullConstructor() {
        IfcDirection ifcDirection = new IfcDirection((List<IfcReal>) null);
    }
}