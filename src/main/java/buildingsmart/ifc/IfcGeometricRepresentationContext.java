package buildingsmart.ifc;

public class IfcGeometricRepresentationContext extends IfcRepresentationContext {
    private int CoordinateSpaceDimension;
    private REAL Precision;
    private IfcAxis2Placement WorldCoordinateSystem;
    private IfcDirection TrueNorth;
    private IfcGeometricRepresentationSubContext[] HasSubContexts;
}
