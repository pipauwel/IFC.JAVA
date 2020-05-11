package buildingsmart.util;

import buildingsmart.ifc.IfcDirection;
import buildingsmart.ifc.IfcLengthMeasure;
import buildingsmart.ifc.IfcReal;
import buildingsmart.ifc.IfcVector;
import com.sun.istack.internal.NotNull;

import java.util.List;

import static java.lang.Math.sqrt;

public class Functions {
    // TODO: test all functions

    /**
     * @param arg1 The first input direction.
     * @param arg2 The second input direction.
     * @return The vector (or cross) product of two input directions. The input
     * directions must be three-dimensional. The result is always a vector which
     * is unitless. If one of the input directions has all components equal to
     * zero, or if they are either parallel or anti-parallel, a vector of zero
     * magnitude is returned.
     * @throws IllegalArgumentException If at least one of the arguments is
     *                                  null, or if at least one is not
     *                                  three-dimensional.
     */
    public static IfcVector ifcCrossProduct(@NotNull IfcDirection arg1,
                                            @NotNull IfcDirection arg2) {
        if (arg1 == null || arg2 == null) {
            throw new IllegalArgumentException("arguments cannot be null");
        }
        if (arg1.getDim().getValue() != 3 || arg2.getDim().getValue() != 3) {
            throw new IllegalArgumentException(
                    "arguments must be three-dimensional");
        }
        // default result if the directions are parallel, anti-parallel or
        // one of them has components that are all zero
        IfcVector result = new IfcVector(arg1, new IfcLengthMeasure(0));
        List<IfcReal> v1Real;
        List<IfcReal> v2Real;
        try {
            v1Real = ifcNormalise(arg1).getDirectionRatios();
            v2Real = ifcNormalise(arg2).getDirectionRatios();
        } catch (NullPointerException e) {
            return result;
        }
        double[] v1 = new double[v1Real.size()];
        double[] v2 = new double[v2Real.size()];
        for (byte i = 0; i < v1.length; i++) {
            v1[i] = v1Real.get(i).getValue();
            v2[i] = v2Real.get(i).getValue();
        }

        double[] res = new double[v1.length];
        res[0] = v1[1] * v2[2] - v1[2] * v2[1];
        res[1] = v1[2] * v2[0] - v1[0] * v2[2];
        res[2] = v1[0] * v2[1] - v1[1] * v2[0];
        double magnitude = 0;
        for (double component : res) {
            magnitude += component * component;
        }
        if (magnitude > 0) {
            result = new IfcVector(new IfcDirection(res),
                    new IfcLengthMeasure(sqrt(magnitude)));
        }
        return result;
    }

    /**
     * @param direction The IfcDirection of which the components should be
     *                  normalized.
     * @return IfcDirection whose components are normalized to have a sum of
     * squares of 1.0. If the input argument is null or its components are all
     * zero then the output is null.
     */
    public static IfcDirection ifcNormalise(IfcDirection direction) {
        if (direction == null) {
            return null;
        }
        double magnitude = 0;
        byte dim = direction.getDim().getValue();

        for (byte i = 0; i < dim; i++) {
            double component = direction.getDirectionRatios().get(i).getValue();
            magnitude += (component * component);
        }
        if (magnitude > 0) {
            magnitude = sqrt(magnitude);
            double[] directionRatios = new double[dim];
            for (byte i = 0; i < dim; i++) {
                double component =
                        direction.getDirectionRatios().get(i).getValue();
                directionRatios[i] = component / magnitude;
            }
            return new IfcDirection(directionRatios);
        }
        return null;
    }

    /**
     * @param vector The IfcVector of which the components should be
     *               normalized.
     * @return IfcVector whose components are normalized to have a sum of
     * squares of 1.0. If the input argument is null or its components are all
     * zero then the output is null.
     */
    public static IfcVector ifcNormalise(IfcVector vector) {
        if (vector == null || vector.getMagnitude().getValue() == 0) {
            return null;
        }
        double magnitude = 0;
        byte dim = vector.getDim().getValue();

        for (byte i = 0; i < dim; i++) {
            double component = vector.getDirectionRatios().get(i).getValue();
            magnitude += (component * component);
        }
        if (magnitude > 0) {
            magnitude = sqrt(magnitude);
            double[] directionRatios = new double[dim];
            for (byte i = 0; i < dim; i++) {
                double component =
                        vector.getDirectionRatios().get(i).getValue();
                directionRatios[i] = component / magnitude;
            }
            return new IfcVector(new IfcDirection(directionRatios),
                    new IfcLengthMeasure(1));
        }
        return null;
    }
}
