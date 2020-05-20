// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyEnumeration;
import com.buildingsmart.tech.ifc.IfcUtilityResource.IfcStateEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5ec3c35f-2ead-4c73-bd7f-61f6f74708eb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSimplePropertyTemplate extends IfcPropertyTemplate
{
	@Description("Property type defining whether the property template defines a property with a single value, a bounded value, a list value, a table value, an enumerated value, or a reference value. Or the quantity type defining whether the template defines a quantity with a length, area, volume, weight or time value.  <blockquote class=\"note\">NOTE&nbsp; the value of this property determines the correct use of the <em>PrimaryUnit</em>, <em>SecondaryUnit</em>, <em>PrimaryDataType</em>, <em>SecondaryDataType</em>, and <em>Expression</em> attributes.</blockquote>")
	@DataMember(Order = 0)
	@Guid("27ab0dc4-9cf7-46d0-8faf-db2ae107b1c4")
	@JacksonXmlProperty(isAttribute=true, localName = "templateType")
	private IfcSimplePropertyTemplateTypeEnum templateType;

	@Description("Primary measure type assigned to the definition of the property. It should be provided, if the <em>PropertyType</em> is set to:  <ul>  <li><small>P_SINGLEVALUE</small>: determining the measure type of <em>IfcPropertySingleValue.NominalValue</em></li>  <li><small>P_ENUMERATEDVALUE</small>: determining the measure type of <em>IfcPropertyEnumeratedValue.EnumerationValues</em></li>  <li><small>P_BOUNDEDVALUE</small>: determining the measure type of <em>IfcPropertyBoundedValue.LowerBoundValue</em></li>  <li><small>P_LISTVALUE</small>: determining the measure type of <em>IfcPropertyListValue.ListValues</em></li>  <li><small>P_TABLEVALUE</small>: determining the measure type of <em>IfcPropertyTableValue.DefiningValues</em></li>  <li><small>P_REFERENCEVALUE</small>: determining the measure type of <em>IfcPropertyTableValue.PropertyReference</em></li></ul>  <blockquote class=\"note\">NOTE&nbsp; The value range of the measure type is within the select type <em>IfcValue</em> for all <em>PropertyType</em>'s with the exeption of <small>P_REFERENCEVALUE</small>. Here it is within the select type <em>IfcObjectReferenceSelect</em>.</blockquote>")
	@DataMember(Order = 1)
	@Guid("23f2b0c9-3b16-4f38-a416-eb4d1b8a6eb6")
	@JacksonXmlProperty(isAttribute=false, localName = "primaryMeasureType")
	private IfcLabel primaryMeasureType;

	@Description("Secondary measure type assigned to the definition of the property. It should be provided, if the <em>PropertyType</em> is set to:  <ul>  <li><small>P_BOUNDEDVALUE</small>: determining the measure type of <em>IfcPropertyBoundedValue.UpperBoundValue</em></li>  <li><small>P_TABLEVALUE</small>: determining the measure type of <em>IfcPropertyTableValue.DefinedValues</em></li>  </ul>  The value range of the measure type is within the select type <em>IfcValue</em>  for all <em>PropertyType</em>'s with the exeption of <small>P_ENUMERATEDVALUE</small>. Here it is the comma delimited list of enumerators.  <blockquote class=\"note\">      NOTE&nbsp; The measure type of <em>IfcPropertyEnumeration.EnumerationValues</em> is provided as <em>PrimaryDataType</em>.  </blockquote>")
	@DataMember(Order = 2)
	@Guid("3d5c231d-ff1d-43b9-8032-e56540c68963")
	@JacksonXmlProperty(isAttribute=false, localName = "secondaryMeasureType")
	private IfcLabel secondaryMeasureType;

	@Description("Name of the property enumeration, and list of all valid enumerators being selectable values, assigned to the definition of the property.   This attribute shall only be provided, if the <em>PropertyType</em> is set to:  <ul>  <li><small>P_ENUMERATEDVALUE</small></li>  </ul>")
	@DataMember(Order = 3)
	@Guid("883e5f6b-01e4-4244-a489-be75a31918fe")
	@JacksonXmlProperty(isAttribute=false, localName = "enumerators")
	private IfcPropertyEnumeration enumerators;

	@Description("Primary unit assigned to the definition of the property. It should be provided, if the <em>PropertyType</em> is set to:  <ul>  <li><small>P_SINGLEVALUE</small>: determining the <em>IfcPropertySingleValue.Unit</em></li>  <li><small>P_ENUMERATEDVALUE</small>: determining the <em>IfcPropertyEnumeration.Unit</em></li>  <li><small>P_BOUNDEDVALUE</small>: determining the <em>IfcPropertyBoundedValue.Unit</em></li>  <li><small>P_LISTVALUE</small>: determining the <em>IfcPropertyListValue.Unit</em></li>  <li><small>P_TABLEVALUE</small>: determining the <em>IfcPropertyTableValue.DefiningUnit</em></li>  </ul>")
	@DataMember(Order = 4)
	@Guid("e67fbcd2-1af8-469f-bfb0-4cda583fb0c6")
	@JacksonXmlProperty(isAttribute=true, localName = "primaryUnit")
	private IfcUnit primaryUnit;

	@Description("Secondary unit assigned to the definition of the property. It should be provided, if the <em>PropertyType</em> is set to:  <ul>  <li><small>P_TABLEVALUE</small>: determining the <em>IfcPropertyTableValue.DefinedUnit</em></li>  </ul>")
	@DataMember(Order = 5)
	@Guid("c3750bec-8371-47de-bf41-b9ac5295c1bb")
	@JacksonXmlProperty(isAttribute=true, localName = "secondaryUnit")
	private IfcUnit secondaryUnit;

	@Description("The expression used to store additional information for the property template depending on the <em>PropertyType</em>. It should the following definitions, if the <em>PropertyType</em> is set to:  <ul>  <li><small>P_TABLEVALUE</small>: the expression that could be evaluated to define the correlation between the defining values and the defined values.</li>  <li><small>Q_LENGTH, Q_AREA, Q_VOLUME, Q_COUNT, Q_WEIGTH, Q_TIME</small>: the formula to be used to calculate the quantity</li>  </ul>  <blockquote class=\"note\">NOTE&nbsp; No value shall be asserted if the <em>PropertyType</em> is not listed above.</blockquote>")
	@DataMember(Order = 6)
	@Guid("2e44a5f9-8aa1-484d-86c1-21a2609f2dcc")
	@JacksonXmlProperty(isAttribute=true, localName = "expression")
	private IfcLabel expression;

	@Description("Information about the access state of the property. It determines whether a property be viewed and/or modified by any receiving application without specific knowledge of it. <br><br>  <b>Attribute use definition for <em>IfcStateEnum</em></b>    <ul>  <li>READWRITE: Properties of this template are readable and writable. They may be viewed and modified by users of any application. These are typical informational properties set by a user.</li>    <li>READONLY: Properties of this template are read-only. They may be viewed but not modified by users of any application. (Applications may generate such values). These are typical automatically generated properties that should be displayed only, but not written back.</li>    <li>LOCKED: Properties of this template are locked. They may only be accessed by the owning application (the publisher of the property set template). These are typically application depended, internal properties that should not be published.</li>    <li>READWRITELOCKED: Properties of this template are locked, readable, and writable. They may only be accessed by the owning application.</li>    <li>READONLYLOCKED: Properties of this template are locked and read-only. They may only be accessed by the owning application. </li>    </ul>")
	@DataMember(Order = 7)
	@Guid("2225a8e6-f09f-47d2-b907-7769a21deed9")
	@JacksonXmlProperty(isAttribute=true, localName = "accessState")
	private IfcStateEnum accessState;


	public IfcSimplePropertyTemplate()
	{
	}

	public IfcSimplePropertyTemplate(String globalId)
	{
		super(globalId);
	}

	public IfcSimplePropertyTemplateTypeEnum getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(IfcSimplePropertyTemplateTypeEnum templateType) {
		this.templateType = templateType;
	}

	public IfcLabel getPrimaryMeasureType() {
		return this.primaryMeasureType;
	}

	public void setPrimaryMeasureType(IfcLabel primaryMeasureType) {
		this.primaryMeasureType = primaryMeasureType;
	}

	public IfcLabel getSecondaryMeasureType() {
		return this.secondaryMeasureType;
	}

	public void setSecondaryMeasureType(IfcLabel secondaryMeasureType) {
		this.secondaryMeasureType = secondaryMeasureType;
	}

	public IfcPropertyEnumeration getEnumerators() {
		return this.enumerators;
	}

	public void setEnumerators(IfcPropertyEnumeration enumerators) {
		this.enumerators = enumerators;
	}

	public IfcUnit getPrimaryUnit() {
		return this.primaryUnit;
	}

	public void setPrimaryUnit(IfcUnit primaryUnit) {
		this.primaryUnit = primaryUnit;
	}

	public IfcUnit getSecondaryUnit() {
		return this.secondaryUnit;
	}

	public void setSecondaryUnit(IfcUnit secondaryUnit) {
		this.secondaryUnit = secondaryUnit;
	}

	public IfcLabel getExpression() {
		return this.expression;
	}

	public void setExpression(IfcLabel expression) {
		this.expression = expression;
	}

	public IfcStateEnum getAccessState() {
		return this.accessState;
	}

	public void setAccessState(IfcStateEnum accessState) {
		this.accessState = accessState;
	}


}

