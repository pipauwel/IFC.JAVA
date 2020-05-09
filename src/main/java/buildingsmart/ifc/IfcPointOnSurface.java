package buildingsmart.ifc;

public abstract class IfcPointOnSurface extends IfcPoint {
    private IfcSurface BasisSurface;
    private double PointParameterU;
    private double PointParameterV;
    private int Dim;
}
