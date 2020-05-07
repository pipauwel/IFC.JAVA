// This file was automatically generated from IFCDOC at www.buildingsmart-tech.org.
// IFC content is copyright (C) 1996-2013 BuildingSMART International Ltd.

package buildingsmart.ifc
{
	public class IfcConstraint extends IfcBase
	{
		private string Name;
		private string Description;
		private IfcConstraintEnum ConstraintGrade;
		private string ConstraintSource;
		private IfcActorSelect CreatingActor;
		private IfcDateTimeSelect CreationTime;
		private string UserDefinedGrade;
		private IfcConstraintClassificationRelationship[] ClassifiedAs;
		private IfcConstraintRelationship[] RelatesConstraints;
		private IfcConstraintRelationship[] IsRelatedWith;
		private IfcPropertyConstraintRelationship[] PropertiesForConstraint;
		private IfcConstraintAggregationRelationship[] Aggregates;
		private IfcConstraintAggregationRelationship[] IsAggregatedIn;
	}
}
