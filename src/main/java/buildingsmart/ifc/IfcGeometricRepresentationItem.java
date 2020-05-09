package buildingsmart.ifc;

/**
 * An geometric representation item is a representation item that has the
 * additional meaning of having geometric position or orientation or both.
 * This meaning is present by virtue of:
 * <ul>
 *     <li>being a Cartesian point or a direction</li>
 *     <li>referencing directly a Cartesian point or direction</li>
 *     <li>referencing indirectly a Cartesian point or direction</li>
 * </ul>
 * <p>
 * An indirect reference to a Cartesian point or direction means that a given
 * geometric item references the Cartesian point or direction through one or
 * more intervening geometry or topology items.
 *
 * <p>
 * EXAMPLE: Consider a circle. It gains its geometric position and
 * orientation by virtue of a reference to axis2_placement
 * (IfcAxis2Placement) that is turn references a cartesian_point
 * (IfcCartesianPoint) and several directions (IfcDirection).
 *
 * <p>
 * EXAMPLE: Consider a manifold brep. A manifold_solid_brep
 * (IfcManifoldSolidBrep) is a geometric_representation_item
 * (IfcGeometricRepresentationItem) that through several layers of
 * topological_representation_item's (IfcTopologicalRepresentationItem)
 * references poly loops (IfcPolyLoop). Through additional intervening
 * entities poly loops reference cartesian_point's (IfcCartesianPoint).
 */
public abstract class IfcGeometricRepresentationItem
        extends IfcRepresentationItem {
}
