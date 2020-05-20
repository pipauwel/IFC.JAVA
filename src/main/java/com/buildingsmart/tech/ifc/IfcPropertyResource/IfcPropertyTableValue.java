// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("e3c26a8d-a8eb-45a1-ae3b-cf89be51902e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyTableValue extends IfcSimpleProperty
{
	@Description("List of defining values, which determine the defined values. This list shall have unique values only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Guid("9867214e-f440-4aef-b09f-77d8191be7e1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "definingValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "definingValues")
	private List<IfcValue> definingValues;

	@Description("Defined values which are applicable for the scope as defined by the defining values.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Guid("ceaeca4b-57ed-4f16-b679-5ae20096a3fd")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "definedValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "definedValues")
	private List<IfcValue> definedValues;

	@Description("Expression for the derivation of defined values from the defining values, the expression is given for information only, i.e. no automatic processing can be expected from the expression.")
	@DataMember(Order = 2)
	@Guid("44bb4232-b2a5-467d-b418-1173fc69da99")
	@JacksonXmlProperty(isAttribute=true, localName = "expression")
	private IfcText expression;

	@Description("Unit for the defining values, if not given, the default value for the measure type (given by the TYPE of the defining values) is used as defined by the global unit assignment at IfcProject.")
	@DataMember(Order = 3)
	@Guid("78024b01-73ed-4f40-9b79-de9b88a20510")
	@JacksonXmlProperty(isAttribute=true, localName = "definingUnit")
	private IfcUnit definingUnit;

	@Description("Unit for the defined values, if not given, the default value for the measure type (given by the TYPE of the defined values) is used as defined by the global unit assignment at IfcProject.")
	@DataMember(Order = 4)
	@Guid("c9f7e84f-2e1c-46b9-9f1e-c6f11c4c578b")
	@JacksonXmlProperty(isAttribute=true, localName = "definedUnit")
	private IfcUnit definedUnit;

	@Description("Interpolation of the curve between two defining and defined values that are provided. if not provided a linear interpolation is assumed.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of the attribute list.</blockquote>")
	@DataMember(Order = 5)
	@Guid("8f0aca34-80c5-47dd-996e-81d3a9395f49")
	@JacksonXmlProperty(isAttribute=true, localName = "curveInterpolation")
	private IfcCurveInterpolationEnum curveInterpolation;


	public IfcPropertyTableValue()
	{
	}

	public IfcPropertyTableValue(IfcIdentifier name)
	{
		super(name);
	}

	public List<IfcValue> getDefiningValues() {
		return this.definingValues;
	}

	public List<IfcValue> getDefinedValues() {
		return this.definedValues;
	}

	public IfcText getExpression() {
		return this.expression;
	}

	public void setExpression(IfcText expression) {
		this.expression = expression;
	}

	public IfcUnit getDefiningUnit() {
		return this.definingUnit;
	}

	public void setDefiningUnit(IfcUnit definingUnit) {
		this.definingUnit = definingUnit;
	}

	public IfcUnit getDefinedUnit() {
		return this.definedUnit;
	}

	public void setDefinedUnit(IfcUnit definedUnit) {
		this.definedUnit = definedUnit;
	}

	public IfcCurveInterpolationEnum getCurveInterpolation() {
		return this.curveInterpolation;
	}

	public void setCurveInterpolation(IfcCurveInterpolationEnum curveInterpolation) {
		this.curveInterpolation = curveInterpolation;
	}


}

