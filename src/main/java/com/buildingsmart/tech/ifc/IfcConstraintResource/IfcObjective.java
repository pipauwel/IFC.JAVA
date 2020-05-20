// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("2a23c0f9-203b-4e38-9564-91c5cb3f651d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcObjective extends IfcConstraint
{
	@Description("A list of nested constraints.    <blockquote class=\"change-ifc2x4\">IFC2X4 CHANGE&nbsp; Modified to be a LIST of nested constraints, which replaces the former <i>IfcConstraintAggregationRelationship</i>.</blockquote>")
	@DataMember(Order = 0)
	@Guid("35571b4c-6b8b-42d5-b196-db21e320b274")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcConstraint")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "benchmarkValues")
	private List<IfcConstraint> benchmarkValues;

	@Description("Enumeration that identifies the logical type of aggregation for the benchmark metrics.    <blockquote class=\"change-ifc2x4\">IFC2X4 CHANGE&nbsp; This attribute replaces replaces the former <i>ResultValues</i> attribute and indicates the aggregation behavior formerly defined at <i>IfcConstraintAggregationRelationship</i>.</blockquote>")
	@DataMember(Order = 1)
	@Guid("73fa8b72-3bf0-4286-8adf-427fb2e3b88c")
	@JacksonXmlProperty(isAttribute=true, localName = "logicalAggregator")
	private IfcLogicalOperatorEnum logicalAggregator;

	@Description("Enumeration that qualifies the type of objective constraint.")
	@DataMember(Order = 2)
	@Required()
	@Guid("7740fe16-eaa1-449e-8ee1-27b4ff3b5a60")
	@JacksonXmlProperty(isAttribute=true, localName = "objectiveQualifier")
	private IfcObjectiveEnum objectiveQualifier;

	@Description("A user defined value that qualifies the type of objective constraint when ObjectiveQualifier attribute of type <em>IfcObjectiveEnum</em> has value USERDEFINED.")
	@DataMember(Order = 3)
	@Guid("7e2e3917-2628-4d81-9f54-990e46d54c40")
	@JacksonXmlProperty(isAttribute=false, localName = "userDefinedQualifier")
	private IfcLabel userDefinedQualifier;


	public IfcObjective()
	{
	}

	public IfcObjective(IfcLabel name, IfcConstraintEnum constraintGrade, IfcObjectiveEnum objectiveQualifier)
	{
		super(name, constraintGrade);
		this.objectiveQualifier = objectiveQualifier;
	}

	public List<IfcConstraint> getBenchmarkValues() {
		return this.benchmarkValues;
	}

	public IfcLogicalOperatorEnum getLogicalAggregator() {
		return this.logicalAggregator;
	}

	public void setLogicalAggregator(IfcLogicalOperatorEnum logicalAggregator) {
		this.logicalAggregator = logicalAggregator;
	}

	public IfcObjectiveEnum getObjectiveQualifier() {
		return this.objectiveQualifier;
	}

	public void setObjectiveQualifier(IfcObjectiveEnum objectiveQualifier) {
		this.objectiveQualifier = objectiveQualifier;
	}

	public IfcLabel getUserDefinedQualifier() {
		return this.userDefinedQualifier;
	}

	public void setUserDefinedQualifier(IfcLabel userDefinedQualifier) {
		this.userDefinedQualifier = userDefinedQualifier;
	}


}

