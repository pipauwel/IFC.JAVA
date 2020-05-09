package buildingsmart.ifc;

public abstract class IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid {
    private IfcCurve Directrix;
    private double StartParam;
    private double EndParam;
    private IfcSurface ReferenceSurface;
}
