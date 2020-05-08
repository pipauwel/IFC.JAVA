package buildingsmart.ifc;

public class IfcSectionedSpine extends IfcGeometricRepresentationItem {
    private IfcCompositeCurve SpineCurve;
    private IfcProfileDef[] CrossSections;
    private IfcAxis2Placement3D[] CrossSectionPositions;
    private int Dim;
}
