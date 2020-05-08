package buildingsmart.ifc;

public class IfcStructuralLoadGroup extends IfcGroup {
    private IfcLoadGroupTypeEnum PredefinedType;
    private IfcActionTypeEnum ActionType;
    private IfcActionSourceTypeEnum ActionSource;
    private double Coefficient;
    private String Purpose;
    private IfcStructuralResultGroup[] SourceOfResultGroup;
    private IfcStructuralAnalysisModel[] LoadGroupFor;
}
