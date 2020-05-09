package buildingsmart.ifc;

public abstract class IfcSectionedSpine extends IfcGeometricRepresentationItem {
    private IfcCompositeCurve SpineCurve;
    private IfcProfileDef[] CrossSections;
    private IfcAxis2Placement3D[] CrossSectionPositions;
    private int Dim;
}
