package buildingsmart.ifc;

public class IfcTrimmedCurve extends IfcBoundedCurve {
    private IfcCurve BasisCurve;
    private IfcTrimmingSelect[] Trim1;
    private IfcTrimmingSelect[] Trim2;
    private BOOLEAN SenseAgreement;
    private IfcTrimmingPreference MasterRepresentation;
}
