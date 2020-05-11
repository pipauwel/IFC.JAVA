package buildingsmart.ifc;

import java.util.Objects;

/**
 * A dimension count is a positive integer used to define the coordinate space
 * dimensionality.
 */
public class IfcDimensionCount implements IfcDefinedType {
    //TODO: in all IfcDefinedTypes, rename their attribute to value
    private final byte value;

    /**
     * @param value The positive integer used to define the coordinate space
     *              dimensionality. Must be either 1, 2 or 3.
     */
    public IfcDimensionCount(byte value) {
        if (value <= 0 || value > 3) {
            throw new IllegalArgumentException(
                    "value must be equal to 1, 2 or 3");
        }
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    /**
     * @return The representation of the type in an IFC STEP file.
     */
    @Override
    public String serialize() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcDimensionCount that = (IfcDimensionCount) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
