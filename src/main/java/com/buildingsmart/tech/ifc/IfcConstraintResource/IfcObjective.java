// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2a23c0f9-203b-4e38-9564-91c5cb3f651d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcObjective extends IfcConstraint
{
	@Description("A list of nested constraints.    <blockquote class=\"change-ifc2x4\">IFC2X4 CHANGE&nbsp; Modified to be a LIST of nested constraints, which replaces the former <i>IfcConstraintAggregationRelationship</i>.</blockquote>")
	@MinLength(1)
	@Guid("35571b4c-6b8b-42d5-b196-db21e320b274")
	private List<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint> benchmarkValues = new ArrayList<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint>();

	@JacksonXmlProperty(isAttribute=true, localName = "LogicalAggregator")
	@Description("Enumeration that identifies the logical type of aggregation for the benchmark metrics.    <blockquote class=\"change-ifc2x4\">IFC2X4 CHANGE&nbsp; This attribute replaces replaces the former <i>ResultValues</i> attribute and indicates the aggregation behavior formerly defined at <i>IfcConstraintAggregationRelationship</i>.</blockquote>")
	@Guid("73fa8b72-3bf0-4286-8adf-427fb2e3b88c")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcLogicalOperatorEnum logicalAggregator;

	@JacksonXmlProperty(isAttribute=true, localName = "ObjectiveQualifier")
	@Description("Enumeration that qualifies the type of objective constraint.")
	@Required()
	@Guid("7740fe16-eaa1-449e-8ee1-27b4ff3b5a60")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcObjectiveEnum objectiveQualifier;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedQualifier")
	@Description("A user defined value that qualifies the type of objective constraint when ObjectiveQualifier attribute of type <em>IfcObjectiveEnum</em> has value USERDEFINED.")
	@Guid("7e2e3917-2628-4d81-9f54-990e46d54c40")
	private String userDefinedQualifier;


	public IfcObjective()
	{
	}

	public IfcObjective(String name, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraintEnum constraintGrade, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcObjectiveEnum objectiveQualifier)
	{
		super(name, constraintGrade);
		this.objectiveQualifier = objectiveQualifier;
	}

	public List<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint> getBenchmarkValues() {
		return this.benchmarkValues;
	}

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcLogicalOperatorEnum getLogicalAggregator() {
		return this.logicalAggregator;
	}

	public void setLogicalAggregator(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcLogicalOperatorEnum logicalAggregator) {
		this.logicalAggregator = logicalAggregator;
	}

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcObjectiveEnum getObjectiveQualifier() {
		return this.objectiveQualifier;
	}

	public void setObjectiveQualifier(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcObjectiveEnum objectiveQualifier) {
		this.objectiveQualifier = objectiveQualifier;
	}

	public String getUserDefinedQualifier() {
		return this.userDefinedQualifier;
	}

	public void setUserDefinedQualifier(String userDefinedQualifier) {
		this.userDefinedQualifier = userDefinedQualifier;
	}


}

