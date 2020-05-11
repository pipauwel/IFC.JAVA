package buildingsmart.ifc;

import buildingsmart.util.Functions;
import com.sun.istack.internal.NotNull;

/**
 * The location and orientation in three dimensional space of three mutually
 * perpendicular axes. An axis2_placement_3D is defined in terms of a point
 * (inherited from placement supertype) and two (ideally orthogonal) axes. It
 * can be used to locate and originate an object in three dimensional space and
 * to define a placement coordinate system. The entity includes a point which
 * forms the origin of the placement coordinate system. Two direction vectors
 * are required to complete the definition of the placement coordinate system.
 * The axis is the placement Z axis direction and the ref_direction is an
 * approximation to the placement X axis direction.
 */
public class IfcAxis2Placement3D extends IfcPlacement {
    private final IfcDirection axis;
    private final IfcDirection refDirection;
    //private IfcDirection[] p;

    public IfcAxis2Placement3D(@NotNull IfcCartesianPoint location,
                               IfcDirection axis, IfcDirection refDirection) {
        super(location);
        if (super.getDim().getValue() != 3) {
            throw new IllegalArgumentException(
                    "location must have dimensionality equal to 3");
        }
        if (axis != null && axis.getDim().getValue() != 3) {
            throw new IllegalArgumentException(
                    "if axis is not null, it must have dimensionality equal " +
                            "to 3");
        }
        if (refDirection != null && refDirection.getDim().getValue() != 3) {
            throw new IllegalArgumentException(
                    "if refDirection is not null, it must have dimensionality" +
                            " equal to 3");
        }
        if (axis != null && refDirection != null &&
                Functions.ifcCrossProduct(axis, refDirection).getMagnitude()
                        .getValue() <= 0) {
            throw new IllegalArgumentException();
        }
        this.axis = axis;
        this.refDirection = refDirection;
    }
}
