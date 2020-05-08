package buildingsmart.ifc;

public class IfcRelConnectsStructuralMember extends IfcRelConnects {
    private IfcStructuralMember RelatingStructuralMember;
    private IfcStructuralConnection RelatedStructuralConnection;
    private IfcBoundaryCondition AppliedCondition;
    private IfcStructuralConnectionCondition AdditionalConditions;
    private double SupportedLength;
    private IfcAxis2Placement3D ConditionCoordinateSystem;
}
