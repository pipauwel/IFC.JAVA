package buildingsmart.ifc;

public class IfcSpace extends IfcSpatialStructureElement {
    private IfcInternalOrExternalEnum InteriorOrExteriorSpace;
    private double ElevationWithFlooring;
    private IfcRelCoversSpaces[] HasCoverings;
    private IfcRelSpaceBoundary[] BoundedBy;
}
