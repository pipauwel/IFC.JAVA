package buildingsmart.ifc;

public class IfcRectangularTrimmedSurface extends IfcBoundedSurface {
    private IfcSurface BasisSurface;
    private double U1;
    private double V1;
    private double U2;
    private double V2;
    private BOOLEAN Usense;
    private BOOLEAN Vsense;
    private int Dim;
}
