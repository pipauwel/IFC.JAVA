package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A point defined by its coordinates in a two or three dimensional rectangular
 * Cartesian coordinate system, or in a two dimensional parameter space. The
 * entity is defined in a two or three dimensional space.
 */
public class IfcCartesianPoint extends IfcPoint {
    private final List<IfcLengthMeasure> coordinates;
    private final IfcDimensionCount dim; // derived attribute

    /**
     * @param coordinates The first, second, and third coordinate of the point
     *                    location. If placed in a two or three dimensional
     *                    rectangular Cartesian coordinate system,
     *                    Coordinates[1] is the X coordinate, Coordinates[2] is
     *                    the Y coordinate, and Coordinates[3] is the Z
     *                    coordinate.
     * @throws IllegalArgumentException If the size of coordinates is lower than
     *                                  2 or bigger than 3, or if coordinates is
     *                                  null.
     */
    public IfcCartesianPoint(@NotNull List<IfcLengthMeasure> coordinates) {
        if (coordinates == null) {
            throw new IllegalArgumentException("coordinates cannot be null");
        }
        if (coordinates.size() < 2 || coordinates.size() > 3) {
            throw new IllegalArgumentException(
                    "size of coordinates must be 2 or 3");
        }
        this.coordinates = coordinates;
        this.dim = new IfcDimensionCount((byte) coordinates.size());
    }

    /**
     * @param coordinates The first, second, and third coordinate of the point
     *                    location. If placed in a two or three dimensional
     *                    rectangular Cartesian coordinate system,
     *                    Coordinates[1] is the X coordinate, Coordinates[2] is
     *                    the Y coordinate, and Coordinates[3] is the Z
     *                    coordinate.
     * @throws IllegalArgumentException If the size of coordinates is lower than
     *                                  2 or bigger than 3, or if coordinates is
     *                                  null.
     */
    public IfcCartesianPoint(@NotNull double... coordinates) {
        if (coordinates == null) {
            throw new IllegalArgumentException("coordinates cannot be null");
        }
        if (coordinates.length < 2 || coordinates.length > 3) {
            throw new IllegalArgumentException(
                    "size of coordinates must be 2 or 3");
        }
        List<IfcLengthMeasure> coordinatesList =
                new ArrayList<>(coordinates.length);
        for (double coordinate : coordinates) {
            coordinatesList.add(new IfcLengthMeasure(coordinate));
        }
        this.coordinates = coordinatesList;
        this.dim = new IfcDimensionCount((byte) coordinatesList.size());
    }

    /**
     * @return The space dimensionality of this class, determined by the number
     * of coordinates in the List of Coordinates.
     */
    protected IfcDimensionCount getDim() {
        return dim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcCartesianPoint that = (IfcCartesianPoint) o;
        return coordinates.equals(that.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates);
    }
}
