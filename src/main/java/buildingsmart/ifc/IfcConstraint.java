// This file was automatically generated from IFCDOC at www
// .buildingsmart-tech.org.
// IFC content is copyright (C) 1996-2013 BuildingSMART International Ltd.

package buildingsmart.ifc;

public class IfcConstraint extends IfcBase {
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
