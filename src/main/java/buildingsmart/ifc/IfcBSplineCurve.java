package buildingsmart.ifc;

public abstract class IfcBSplineCurve extends IfcBoundedCurve {
    private int Degree;
    private IfcCartesianPoint[] ControlPointsList;
    private IfcBSplineCurveForm CurveForm;
    private boolean ClosedCurve;
    private boolean SelfIntersect;
    private IfcCartesianPoint ControlPoints;
    private int UpperIndexOnControlPoints;
}
