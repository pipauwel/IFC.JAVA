package buildingsmart.ifc;

public class IfcTendon extends IfcReinforcingElement {
    private IfcTendonTypeEnum PredefinedType;
    private IfcLengthMeasure NominalDiameter;
    private double CrossSectionArea;
    private double TensionForce;
    private double PreStress;
    private IfcRatioMeasure FrictionCoefficient;
    private IfcLengthMeasure AnchorageSlip;
    private IfcLengthMeasure MinCurvatureRadius;
}
