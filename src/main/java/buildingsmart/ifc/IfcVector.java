package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.Objects;

/**
 * The vector is defined in terms of the direction and magnitude of the vector.
 * The value of the magnitude attribute defines the magnitude of the vector.
 */
public class IfcVector extends IfcGeometricRepresentationItem
        implements IfcVectorOrDirection {
    private final IfcDirection orientation;
    private final IfcLengthMeasure magnitude;
    //private int dim;

    /**
     * @param orientation The direction of the vector. Cannot be null.
     * @param magnitude   The magnitude of the vector. All vectors of Magnitude
     *                    0.0 are regarded as equal in value regardless of the
     *                    orientation attribute. Cannot be null.
     * @throws IllegalArgumentException If orientation or magnitude are null, or
     *                                  if magnitude is not positive or zero.
     */
    public IfcVector(@NotNull IfcDirection orientation,
                     @NotNull IfcLengthMeasure magnitude) {
        if (orientation == null) {
            throw new IllegalArgumentException("orientation cannot be null");
        }
        if (magnitude == null) {
            throw new IllegalArgumentException("magnitude cannot be null");
        }
        if (magnitude.getValue() < 0) {
            throw new IllegalArgumentException(
                    "magnitude must be equal or higher than zero");
        }
        this.orientation = orientation;
        this.magnitude = magnitude;
    }

    public IfcLengthMeasure getMagnitude() {
        return magnitude;
    }

    /**
     * @return The space dimensionality of this class, defined by the number of
     * real in the list of DirectionRatios.
     */
    @Override
    public IfcDimensionCount getDim() {
        return orientation.getDim();
    }

    /**
     * @return The components of the direction in the direction of X axis
     * (DirectionRatios[1]), of Y axis (DirectionRatios[2]), and of Z axis
     * (DirectionRatios[3])
     */
    @Override
    public List<IfcReal> getDirectionRatios() {
        return orientation.getDirectionRatios();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcVector ifcVector = (IfcVector) o;
        return (orientation.equals(ifcVector.orientation) &&
                magnitude.equals(ifcVector.magnitude)) ||
                (magnitude.getValue() == 0 &&
                        ifcVector.magnitude.getValue() == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation, magnitude);
    }
}
