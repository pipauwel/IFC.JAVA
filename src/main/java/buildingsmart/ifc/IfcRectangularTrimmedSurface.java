package buildingsmart.ifc;

public abstract class IfcRectangularTrimmedSurface extends IfcBoundedSurface {
    private IfcSurface BasisSurface;
    private double U1;
    private double V1;
    private double U2;
    private double V2;
    private boolean Usense;
    private boolean Vsense;
    private int Dim;
}
