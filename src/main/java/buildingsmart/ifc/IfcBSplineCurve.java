package buildingsmart.ifc;

public class IfcBSplineCurve extends IfcBoundedCurve {
    private INTEGER Degree;
    private IfcCartesianPoint[] ControlPointsList;
    private IfcBSplineCurveForm CurveForm;
    private LOGICAL ClosedCurve;
    private LOGICAL SelfIntersect;
    private IfcCartesianPoint ControlPoints;
    private INTEGER UpperIndexOnControlPoints;
}
