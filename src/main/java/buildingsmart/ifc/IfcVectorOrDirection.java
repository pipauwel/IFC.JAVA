package buildingsmart.ifc;

import java.util.List;

/**
 * Identifies the types of entity which can participate in vector computations.
 */
public interface IfcVectorOrDirection {

    /**
     * @return The space dimensionality of this class, defined by the number of
     * real in the list of DirectionRatios.
     */
    IfcDimensionCount getDim();

    /**
     * @return The components of the direction in the direction of X axis
     * (DirectionRatios[1]), of Y axis (DirectionRatios[2]), and of Z axis
     * (DirectionRatios[3])
     */
    List<IfcReal> getDirectionRatios();
}
