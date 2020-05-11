package buildingsmart.ifc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class IfcVectorTest {

    /**
     * Tests whether two vectors with different orientation but magnitude equal
     * to 0 are considered equal.
     */
    @Test
    public void testZeroMagEquals() {
        IfcVector zeroMag1 =
                new IfcVector(new IfcDirection(1, 1), new IfcLengthMeasure(0));
        IfcVector zeroMag2 =
                new IfcVector(new IfcDirection(3, 7), new IfcLengthMeasure(0));
        assertEquals(zeroMag1, zeroMag2);
    }

    @Test
    public void testNonEqual() {
        IfcVector v1 =
                new IfcVector(new IfcDirection(1, 1), new IfcLengthMeasure(5));
        IfcVector v2 =
                new IfcVector(new IfcDirection(3, 7), new IfcLengthMeasure(7));
        assertNotEquals(v1, v2);

    }
}