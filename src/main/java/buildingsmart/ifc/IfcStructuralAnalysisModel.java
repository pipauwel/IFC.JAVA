package buildingsmart.ifc;

public class IfcStructuralAnalysisModel extends IfcSystem {
    private IfcAnalysisModelTypeEnum PredefinedType;
    private IfcAxis2Placement3D OrientationOf2DPlane;
    private IfcStructuralLoadGroup[] LoadedBy;
    private IfcStructuralResultGroup[] HasResults;
}
