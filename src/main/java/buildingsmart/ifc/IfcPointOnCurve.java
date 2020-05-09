package buildingsmart.ifc;

public abstract class IfcPointOnCurve extends IfcPoint {
    private IfcCurve BasisCurve;
    private double PointParameter;
    private int Dim;
}
