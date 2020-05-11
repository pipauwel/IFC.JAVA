package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

/**
 * A placement entity defines the local environment for the definition of a
 * geometry item. It locates the item to be defined and, in the case of the axis
 * placement subtypes, gives its orientation.
 */
public abstract class IfcPlacement extends IfcGeometricRepresentationItem {
    private final IfcCartesianPoint location;
    //private int Dim;

    /**
     * @param location The geometric position of a reference point, such as the
     *                 center of a circle, of the item to be located. Cannot be
     *                 null
     * @throws IllegalArgumentException If location is null.
     */
    public IfcPlacement(@NotNull IfcCartesianPoint location) {
        if (location == null) {
            throw new IllegalArgumentException("location can't be null");
        }
        this.location = location;
    }

    /**
     * @param coordinates The first, second, and third coordinate of the
     *                    reference point, such as the center of a circle, of
     *                    the item to be located. If placed in a two or three
     *                    dimensional rectangular Cartesian coordinate system,
     *                    Coordinates[1] is the X coordinate, Coordinates[2] is
     *                    the Y coordinate, and Coordinates[3] is the Z
     *                    coordinate.
     * @throws IllegalArgumentException If the size of coordinates is lower than
     *                                  2 or bigger than 3, or if coordinates is
     *                                  null.
     */
    public IfcPlacement(@NotNull double... coordinates) {
        this.location = new IfcCartesianPoint(coordinates);
    }

    /**
     * @return The space dimensionality of this class, derived from the
     * dimensionality of the location.
     */
    public IfcDimensionCount getDim() {
        return location.getDim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcPlacement that = (IfcPlacement) o;
        return location.equals(that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}
