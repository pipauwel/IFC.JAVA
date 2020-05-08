package buildingsmart.ifc;

public class IfcConstraintAggregationRelationship {
    private String Name;
    private String Description;
    private IfcConstraint RelatingConstraint;
    private IfcConstraint[] RelatedConstraints;
    private IfcLogicalOperatorEnum LogicalAggregator;
}
