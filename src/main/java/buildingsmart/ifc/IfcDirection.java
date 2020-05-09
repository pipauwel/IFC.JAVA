package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This entity defines a general direction vector in two or three dimensional
 * space. The actual magnitudes of the components have no effect upon the
 * direction being defined, only the ratios X:Y:Z or X:Y are significant.
 */
public class IfcDirection extends IfcGeometricRepresentationItem {
    private final List<IfcReal> directionRatios;
    //private int dim;

    /**
     * @param directionRatios The components in the direction of X axis
     *                        (DirectionRatios[1]), of Y axis
     *                        (DirectionRatios[2]), and of Z axis
     *                        (DirectionRatios[3]). The size of this list
     *                        must be either 2 or 3, and it cannot be null.
     * @throws IllegalArgumentException If the size of directionRatios is not
     *                                  2 or 3, or if directionRatios is null.
     */
    public IfcDirection(@NotNull List<IfcReal> directionRatios) {
        if (directionRatios == null) {
            throw new IllegalArgumentException(
                    "directionRatios cannot be null");
        }
        if (directionRatios.size() < 2 || directionRatios.size() > 3) {
            throw new IllegalArgumentException(
                    "size of directionRatios must be 2 or 3");
        }
        this.directionRatios = directionRatios;
    }

    /**
     * @param directionRatios The components in the direction of X axis
     *                        (DirectionRatios[1]), of Y axis
     *                        (DirectionRatios[2]), and of Z axis
     *                        (DirectionRatios[3]). The size of this list
     *                        must be either 2 or 3, and it cannot be null.
     * @throws IllegalArgumentException If the size of directionRatios is not
     *                                  2 or 3, or if directionRatios is null.
     */
    public IfcDirection(@NotNull double... directionRatios) {
        if (directionRatios == null) {
            throw new IllegalArgumentException(
                    "directionRatios cannot be null");
        }
        if (directionRatios.length < 2 || directionRatios.length > 3) {
            throw new IllegalArgumentException(
                    "size of directionRatios must be 2 or 3");
        }
        List<IfcReal> directionRatiosList =
                new ArrayList<>(directionRatios.length);
        for (double dirRatio : directionRatios) {
            directionRatiosList.add(new IfcReal(dirRatio));
        }
        this.directionRatios = directionRatiosList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcDirection that = (IfcDirection) o;
        return directionRatios.equals(that.directionRatios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directionRatios);
    }
}
