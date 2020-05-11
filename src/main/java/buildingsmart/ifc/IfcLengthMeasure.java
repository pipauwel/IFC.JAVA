package buildingsmart.ifc;

import java.util.Objects;

/**
 * A length measure is the value of a distance.
 * <p>
 * Usually measured in millimeters (mm).
 */
public class IfcLengthMeasure implements IfcDefinedType {
    private final double value;

    /**
     * @param value The value of the distance.
     */
    public IfcLengthMeasure(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    /**
     * @return The representation of the type in an IFC STEP file.
     */
    @Override
    public String serialize() {
        return Double.toString(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcLengthMeasure ifcLengthMeasure1 = (IfcLengthMeasure) o;
        return Double.compare(ifcLengthMeasure1.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
