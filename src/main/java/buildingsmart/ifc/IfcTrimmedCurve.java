package buildingsmart.ifc;

public abstract class IfcTrimmedCurve extends IfcBoundedCurve {
    private IfcCurve BasisCurve;
    private IfcTrimmingSelect[] Trim1;
    private IfcTrimmingSelect[] Trim2;
    private boolean SenseAgreement;
    private IfcTrimmingPreference MasterRepresentation;
}
