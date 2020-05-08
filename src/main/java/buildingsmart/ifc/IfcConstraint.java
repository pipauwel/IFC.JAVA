package buildingsmart.ifc;

public class IfcConstraint {
    private String Name;
    private String Description;
    private IfcConstraintEnum ConstraintGrade;
    private String ConstraintSource;
    private IfcActorSelect CreatingActor;
    private IfcDateTimeSelect CreationTime;
    private String UserDefinedGrade;
    private IfcConstraintClassificationRelationship[] ClassifiedAs;
    private IfcConstraintRelationship[] RelatesConstraints;
    private IfcConstraintRelationship[] IsRelatedWith;
    private IfcPropertyConstraintRelationship[] PropertiesForConstraint;
    private IfcConstraintAggregationRelationship[] Aggregates;
    private IfcConstraintAggregationRelationship[] IsAggregatedIn;
}
