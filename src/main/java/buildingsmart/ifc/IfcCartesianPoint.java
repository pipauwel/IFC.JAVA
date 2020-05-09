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
    //private int dim;

    /**
     * @param coordinates The first, second, and third coordinate of the point
     *                    location. If placed in a two or three dimensional
     *                    rectangular Cartesian coordinate system,
     *                    Coordinates[1] is the X coordinate, Coordinates[2] is
     *                    the Y coordinate, and Coordinates[3] is the Z
     *                    coordinate.
     * @throws IllegalArgumentException If the size of coordinates is lower than
     *                                  1 or bigger than 3, or if coordinates is
     *                                  null.
     */
    public IfcCartesianPoint(@NotNull List<IfcLengthMeasure> coordinates) {
        if (coordinates == null) {
            throw new IllegalArgumentException("coordinates cannot be null");
        }
        if (coordinates.size() < 1 || coordinates.size() > 3) {
            throw new IllegalArgumentException(
                    "size of coordinates must be 2 or 3");
        }
        this.coordinates = coordinates;
    }

    /**
     * @param coordinates The first, second, and third coordinate of the point
     *                    location. If placed in a two or three dimensional
     *                    rectangular Cartesian coordinate system,
     *                    Coordinates[1] is the X coordinate, Coordinates[2] is
     *                    the Y coordinate, and Coordinates[3] is the Z
     *                    coordinate.
     * @throws IllegalArgumentException If the size of coordinates is lower than
     *                                  1 or bigger than 3, or if coordinates is
     *                                  null.
     */
    public IfcCartesianPoint(@NotNull double... coordinates) {
        if (coordinates == null) {
            throw new IllegalArgumentException("coordinates cannot be null");
        }
        if (coordinates.length < 1 || coordinates.length > 3) {
            throw new IllegalArgumentException(
                    "size of coordinates must be 2 or 3");
        }
        List<IfcLengthMeasure> coordinatesList =
                new ArrayList<>(coordinates.length);
        for (double coordinate : coordinates) {
            coordinatesList.add(new IfcLengthMeasure(coordinate));
        }
        this.coordinates = coordinatesList;
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
