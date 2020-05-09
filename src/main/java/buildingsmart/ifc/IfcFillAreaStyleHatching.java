package buildingsmart.ifc;

public abstract class IfcFillAreaStyleHatching
        extends IfcGeometricRepresentationItem {
    private IfcCurveStyle HatchLineAppearance;
    private IfcHatchLineDistanceSelect StartOfNextHatchLine;
    private IfcCartesianPoint PointOfReferenceHatchLine;
    private IfcCartesianPoint PatternStart;
    private double HatchLineAngle;
}
