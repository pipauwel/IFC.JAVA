package buildingsmart.ifc;

public abstract class IfcCompositeCurve extends IfcBoundedCurve {
    private IfcCompositeCurveSegment[] Segments;
    private boolean SelfIntersect;
    private int NSegments;
    private boolean ClosedCurve;
}
