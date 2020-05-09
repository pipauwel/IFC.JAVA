package buildingsmart.ifc;

public class IfcStructuralResultGroup extends IfcGroup {
    private IfcAnalysisTheoryTypeEnum TheoryType;
    private IfcStructuralLoadGroup ResultForLoadGroup;
    private boolean IsLinear;
    private IfcStructuralAnalysisModel[] ResultGroupFor;
}
