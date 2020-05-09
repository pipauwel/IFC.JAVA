package buildingsmart.ifc;

public abstract class IfcOffsetCurve3D extends IfcCurve {
    private IfcCurve BasisCurve;
    private double Distance;
    private boolean SelfIntersect;
    private IfcDirection RefDirection;
}
