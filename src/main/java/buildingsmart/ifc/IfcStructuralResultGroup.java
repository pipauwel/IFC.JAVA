package buildingsmart.ifc;

public class IfcStructuralResultGroup extends IfcGroup {
    private IfcAnalysisTheoryTypeEnum TheoryType;
    private IfcStructuralLoadGroup ResultForLoadGroup;
    private BOOLEAN IsLinear;
    private IfcStructuralAnalysisModel[] ResultGroupFor;
}
