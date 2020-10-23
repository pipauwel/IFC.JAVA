// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("70b10571-8732-44f7-a5b2-3fdb229d547b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcDoorStandardCase.class, name = "IfcDoorStandardCase"))
public class IfcDoor extends IfcBuildingElement
{
	@Description("Overall measure of the height, it reflects the Z Dimension of a bounding box, enclosing the <strike>body of the</strike> door opening. If omitted, the <em>OverallHeight</em> should be taken from the geometric representation of the <em>IfcOpening</em> in which the door is inserted.     <blockquote class=\"note\">NOTE&nbsp; The body of the door might be taller then the door opening (e.g. in cases where the door lining includes a casing). In these cases the <em>OverallHeight</em> shall still be given as the door opening height, and not as the total height of the door lining.</blockquote>")
	@DataMember(Order = 0)
	@Guid("82f1996a-2267-42e4-9a5b-d4f2a6e4f8e8")
	@JacksonXmlProperty(isAttribute=false, localName = "overallHeight")
	private IfcPositiveLengthMeasure overallHeight;

	@Description("Overall measure of the width, it reflects the X Dimension of a bounding box, enclosing the <strike>body of the</strike> door opening. If omitted, the <em>OverallWidth</em> should be taken from the geometric representation of the <em>IfcOpening</em> in which the door is inserted.     <blockquote class=\"note\">NOTE&nbsp; The body of the door might be wider then the door opening (e.g. in cases where the door lining includes a casing). In these cases the <em>OverallWidth</em> shall still be given as the door opening width, and not as the total width of the door lining.</blockquote>")
	@DataMember(Order = 1)
	@Guid("646a9c81-0757-404c-9c64-84e003fede0a")
	@JacksonXmlProperty(isAttribute=false, localName = "overallWidth")
	private IfcPositiveLengthMeasure overallWidth;

	@Description("Predefined generic type for a door that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcDoorType</em> is assigned, providing its own <em>IfcDoorType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 2)
	@Guid("a4378e60-7e89-4d23-840a-b63a2e39ea45")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcDoorTypeEnum predefinedType;

	@Description("Type defining the general layout and operation of the door type in terms of the partitioning of panels and panel operations.   <blockquote class=\"note\">NOTE&nbsp; The <em>OperationType</em> shall only be used, if no type object <em>IfcDoorType</em> is assigned, providing its own <em>IfcDoorType.OperationType</em>.    </blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 3)
	@Guid("6bdfd4d0-3ffa-4da5-98bd-95b065f45793")
	@JacksonXmlProperty(isAttribute=true, localName = "operationType")
	private IfcDoorTypeOperationEnum operationType;

	@Description("Designator for the user defined operation type, shall only be provided, if the value of <em>OperationType</em> is set to USERDEFINED.")
	@DataMember(Order = 4)
	@Guid("5c07c222-8576-4936-ab56-4f4b1a9eb05a")
	@JacksonXmlProperty(isAttribute=false, localName = "userDefinedOperationType")
	private IfcLabel userDefinedOperationType;


	public IfcDoor()
	{
	}

	public IfcDoor(String globalId)
	{
		super(globalId);
	}

	public IfcPositiveLengthMeasure getOverallHeight() {
		return this.overallHeight;
	}

	public void setOverallHeight(IfcPositiveLengthMeasure overallHeight) {
		this.overallHeight = overallHeight;
	}

	public IfcPositiveLengthMeasure getOverallWidth() {
		return this.overallWidth;
	}

	public void setOverallWidth(IfcPositiveLengthMeasure overallWidth) {
		this.overallWidth = overallWidth;
	}

	public IfcDoorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDoorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcDoorTypeOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(IfcDoorTypeOperationEnum operationType) {
		this.operationType = operationType;
	}

	public IfcLabel getUserDefinedOperationType() {
		return this.userDefinedOperationType;
	}

	public void setUserDefinedOperationType(IfcLabel userDefinedOperationType) {
		this.userDefinedOperationType = userDefinedOperationType;
	}


}

