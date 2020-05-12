package buildingsmart.util;

import buildingsmart.ifc.IfcDirection;
import buildingsmart.ifc.IfcLengthMeasure;
import buildingsmart.ifc.IfcReal;
import buildingsmart.ifc.IfcVector;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FunctionsTest {
    // delta for double comparisons
    private static final double DELTA = 0.000000000000001;

    /**
     * Rounds a floating point number using the specified number of decimal
     * places.
     *
     * @param value  The number to round.
     * @param places The number of decimal places to use.
     * @return The rounded number.
     */
    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Compares two floating point numbers after rounding them to the specified
     * number of decimal places.
     *
     * @param d1     The first value to compare.
     * @param d2     The second value to compare.
     * @param places The number of decimal places to consider.
     * @return {@code true} if the numbers are equal, {@code false} otherwise.
     */
    public static boolean areEqual(double d1, double d2, int places) {
        d1 = round(d1, places);
        d2 = round(d2, places);
        return d1 == d2;
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifcCrossProduct_nullDirection() {
        Functions.ifcCrossProduct(null, new IfcDirection(1, 2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifcCrossProduct_bidimensionalDirection() {
        Functions.ifcCrossProduct(new IfcDirection(2, 6, 3),
                new IfcDirection(1, 9));
    }

    @Test
    public void ifcCrossProduct_componentsAreZero_returnsZeroMagnitudeVector() {
        IfcVector vector = Functions.ifcCrossProduct(new IfcDirection(0, 0, 0),
                new IfcDirection(1, 2, 3));
        assertEquals(0, vector.getMagnitude().getValue(), DELTA);
    }

    @Test
    public void ifcCrossProduct_parallelDirections_returnsZeroMagnitudeVector() {
        IfcVector vector = Functions.ifcCrossProduct(new IfcDirection(2, 4, 8),
                new IfcDirection(1, 2, 4));
        assertEquals(0, vector.getMagnitude().getValue(), DELTA);
    }

    @Test
    public void ifcCrossProduct_antiParallelDirections_returnsZeroMagnitudeVector() {
        IfcVector vector = Functions
                .ifcCrossProduct(new IfcDirection(-1, -2, -4),
                        new IfcDirection(1, 2, 4));
        assertEquals(0, vector.getMagnitude().getValue(), DELTA);
    }

    @Test
    public void ifcCrossProduct_regularDirections() {
        IfcDirection dir1 = new IfcDirection(3, 4, 0);
        IfcDirection dir2 = new IfcDirection(2, -5, 0);
        IfcDirection dir1Norm = Functions.ifcNormalise(dir1);
        IfcDirection dir2Norm = Functions.ifcNormalise(dir2);
        double expectedComp = dir1Norm.getDirectionRatios().get(0).getValue() *
                dir2Norm.getDirectionRatios().get(1).getValue() -
                dir1Norm.getDirectionRatios().get(1).getValue() *
                        dir2Norm.getDirectionRatios().get(0).getValue();

        IfcVector vector = Functions.ifcCrossProduct(dir1, dir2);

        // since the two input directions are on the same plane, we expect
        // the result to be on the axis perpendicular to that plane
        assertEquals(0, vector.getDirectionRatios().get(0).getValue(), DELTA);
        assertEquals(0, vector.getDirectionRatios().get(1).getValue(), DELTA);
        assertEquals(expectedComp,
                vector.getDirectionRatios().get(2).getValue(), DELTA);
        assertEquals(vector.getMagnitude().getValue(),
                abs(vector.getDirectionRatios().get(2).getValue()), DELTA);
    }

    @Test
    public void ifcNormaliseIfcDirection_nullDirection_returnsNull() {
        assertNull(Functions.ifcNormalise((IfcDirection) null));
    }

    @Test
    public void ifcNormaliseIfcDirection_componentsAreZero_returnsNull() {
        IfcDirection zero = new IfcDirection(0, 0, 0);
        assertNull(Functions.ifcNormalise(zero));
    }

    @Test
    public void ifcNormaliseIfcDirection_regularDirection_isNormalized() {
        IfcDirection direction = new IfcDirection(4, 4, 4);
        // components of a normalized vector have a sum of squares of 1
        double expectedComponents = sqrt(1.0 / direction.getDim().getValue());

        IfcDirection normalisedDirection = Functions.ifcNormalise(direction);

        for (IfcReal comp : normalisedDirection.getDirectionRatios()) {
            assertEquals(expectedComponents, comp.getValue(), DELTA);
        }
    }

    @Test
    public void ifcNormaliseIfcVector_nullVector_returnsNull() {
        assertNull(Functions.ifcNormalise((IfcVector) null));
    }

    @Test
    public void ifcNormaliseIfcVector_directionComponentsAreZero_returnsNull() {
        IfcVector zeroDirection = new IfcVector(new IfcDirection(0, 0, 0),
                new IfcLengthMeasure(3));
        assertNull(Functions.ifcNormalise(zeroDirection));
    }

    @Test
    public void ifcNormaliseIfcVector_zeroMagnitude_returnsNull() {
        IfcVector zeroMagnitude = new IfcVector(new IfcDirection(4, 3, 1),
                new IfcLengthMeasure(0));
        assertNull(Functions.ifcNormalise(zeroMagnitude));
    }

    @Test
    public void ifcNormaliseIfcVector_regularVector_isNormalized() {
        IfcVector vector = new IfcVector(new IfcDirection(4, 4, 4),
                new IfcLengthMeasure(10));
        // components of a normalized vector have a sum of squares of 1
        double expectedComponents = sqrt(1.0 / vector.getDim().getValue());
        double expectedMagnitude = 1;

        IfcVector normalisedVector = Functions.ifcNormalise(vector);

        for (IfcReal comp : normalisedVector.getDirectionRatios()) {
            assertEquals(expectedComponents, comp.getValue(), DELTA);
        }
        assertEquals(expectedMagnitude,
                normalisedVector.getMagnitude().getValue(), DELTA);
    }
}