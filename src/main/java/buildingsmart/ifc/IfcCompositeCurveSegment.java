package buildingsmart.ifc;

public abstract class IfcCompositeCurveSegment
        extends IfcGeometricRepresentationItem {
    private IfcTransitionCode Transition;
    private boolean SameSense;
    private IfcCurve ParentCurve;
    private int Dim;
    private IfcCompositeCurve[] UsingCurves;
}
