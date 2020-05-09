package buildingsmart.ifc;

public abstract class IfcAnnotationFillArea
        extends IfcGeometricRepresentationItem {
    private IfcCurve OuterBoundary;
    private IfcCurve[] InnerBoundaries;
}
