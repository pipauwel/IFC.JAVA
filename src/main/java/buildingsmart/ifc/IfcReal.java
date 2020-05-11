package buildingsmart.ifc;

import java.util.Objects;

/**
 * A defined type of simple data type REAL. In principle, the domain of IfcReal
 * (being a Real) is all rational, irrational and scientific real numbers.
 */
public class IfcReal implements IfcDefinedType {
    private final double value;

    public IfcReal(double value) {
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
        IfcReal ifcReal1 = (IfcReal) o;
        return Double.compare(ifcReal1.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
