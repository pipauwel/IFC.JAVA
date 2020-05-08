package buildingsmart.ifc;

public class IfcCompositeCurveSegment extends IfcGeometricRepresentationItem {
    private IfcTransitionCode Transition;
    private BOOLEAN SameSense;
    private IfcCurve ParentCurve;
    private int Dim;
    private IfcCompositeCurve[] UsingCurves;
}
