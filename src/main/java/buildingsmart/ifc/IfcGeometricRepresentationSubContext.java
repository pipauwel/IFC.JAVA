package buildingsmart.ifc;

public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext {
    private IfcGeometricRepresentationContext ParentContext;
    private IfcRatioMeasure TargetScale;
    private IfcGeometricProjectionEnum TargetView;
    private String UserDefinedTargetView;
    private IfcAxis2Placement WorldCoordinateSystem;
    private int CoordinateSpaceDimension;
    private IfcDirection TrueNorth;
    private REAL Precision;
}
