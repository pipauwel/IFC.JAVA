package buildingsmart.ifc;

public class IfcCurveBoundedPlane extends IfcBoundedSurface {
    private IfcPlane BasisSurface;
    private IfcCurve OuterBoundary;
    private IfcCurve[] InnerBoundaries;
    private int Dim;
}
