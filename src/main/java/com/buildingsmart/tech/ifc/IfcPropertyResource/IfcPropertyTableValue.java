// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e3c26a8d-a8eb-45a1-ae3b-cf89be51902e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyTableValue extends IfcSimpleProperty
{
	@Description("List of defining values, which determine the defined values. This list shall have unique values only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@MinLength(1)
	@Guid("9867214e-f440-4aef-b09f-77d8191be7e1")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> definingValues = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue>();

	@Description("Defined values which are applicable for the scope as defined by the defining values.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@MinLength(1)
	@Guid("ceaeca4b-57ed-4f16-b679-5ae20096a3fd")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> definedValues = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue>();

	@JacksonXmlProperty(isAttribute=true, localName = "Expression")
	@Description("Expression for the derivation of defined values from the defining values, the expression is given for information only, i.e. no automatic processing can be expected from the expression.")
	@Guid("44bb4232-b2a5-467d-b418-1173fc69da99")
	private String expression;

	@Description("Unit for the defining values, if not given, the default value for the measure type (given by the TYPE of the defining values) is used as defined by the global unit assignment at IfcProject.")
	@Guid("78024b01-73ed-4f40-9b79-de9b88a20510")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit definingUnit;

	@Description("Unit for the defined values, if not given, the default value for the measure type (given by the TYPE of the defined values) is used as defined by the global unit assignment at IfcProject.")
	@Guid("c9f7e84f-2e1c-46b9-9f1e-c6f11c4c578b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit definedUnit;

	@JacksonXmlProperty(isAttribute=true, localName = "CurveInterpolation")
	@Description("Interpolation of the curve between two defining and defined values that are provided. if not provided a linear interpolation is assumed.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of the attribute list.</blockquote>")
	@Guid("8f0aca34-80c5-47dd-996e-81d3a9395f49")
	private com.buildingsmart.tech.ifc.IfcPropertyResource.IfcCurveInterpolationEnum curveInterpolation;


	public IfcPropertyTableValue()
	{
	}

	public IfcPropertyTableValue(String name)
	{
		super(name);
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> getDefiningValues() {
		return this.definingValues;
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> getDefinedValues() {
		return this.definedValues;
	}

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit getDefiningUnit() {
		return this.definingUnit;
	}

	public void setDefiningUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit definingUnit) {
		this.definingUnit = definingUnit;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit getDefinedUnit() {
		return this.definedUnit;
	}

	public void setDefinedUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit definedUnit) {
		this.definedUnit = definedUnit;
	}

	public com.buildingsmart.tech.ifc.IfcPropertyResource.IfcCurveInterpolationEnum getCurveInterpolation() {
		return this.curveInterpolation;
	}

	public void setCurveInterpolation(com.buildingsmart.tech.ifc.IfcPropertyResource.IfcCurveInterpolationEnum curveInterpolation) {
		this.curveInterpolation = curveInterpolation;
	}


}

