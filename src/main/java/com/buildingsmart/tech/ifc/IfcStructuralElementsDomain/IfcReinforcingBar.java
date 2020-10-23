// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcAreaMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("32b47fe2-32c4-4ac2-8217-42fe8d2afda9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingBar extends IfcReinforcingElement
{
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingBarType</em> instead.</blockquote>")
	@DataMember(Order = 0)
	@Guid("260a1ee8-911e-47fc-8ccf-0980dc39e2f6")
	@JacksonXmlProperty(isAttribute=false, localName = "nominalDiameter")
	private IfcPositiveLengthMeasure nominalDiameter;

	@Description("The effective cross-section area of the reinforcing bar or group of bars.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional.</blockquote>")
	@DataMember(Order = 1)
	@Guid("f50fc626-ccf9-4b2a-b313-1352b0d7b6a7")
	@JacksonXmlProperty(isAttribute=false, localName = "crossSectionArea")
	private IfcAreaMeasure crossSectionArea;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingBarType</em> instead.</blockquote>")
	@DataMember(Order = 2)
	@Guid("0a8da1b1-a7c6-40d4-bc0c-9c921133a8ba")
	@JacksonXmlProperty(isAttribute=false, localName = "barLength")
	private IfcPositiveLengthMeasure barLength;

	@Description("The role, purpose or usage of the bar, i.e. the kind of loads and stresses it is intended to carry.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute renamed from <em>BarRole</em> to <em>PredefinedType</em> and made optional.  Type changed from <em>IfcReinforcingBarRoleEnum</em> without changes to the range of enumeration items.</blockquote>")
	@DataMember(Order = 3)
	@Guid("777b8b8b-390b-48ec-b779-37083964afa6")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcReinforcingBarTypeEnum predefinedType;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingBarType</em> instead.</blockquote>")
	@DataMember(Order = 4)
	@Guid("a9f1a5ea-5f63-40f2-b00d-c12c43572c1b")
	@JacksonXmlProperty(isAttribute=true, localName = "barSurface")
	private IfcReinforcingBarSurfaceEnum barSurface;


	public IfcReinforcingBar()
	{
	}

	public IfcReinforcingBar(String globalId)
	{
		super(globalId);
	}

	public IfcPositiveLengthMeasure getNominalDiameter() {
		return this.nominalDiameter;
	}

	public void setNominalDiameter(IfcPositiveLengthMeasure nominalDiameter) {
		this.nominalDiameter = nominalDiameter;
	}

	public IfcAreaMeasure getCrossSectionArea() {
		return this.crossSectionArea;
	}

	public void setCrossSectionArea(IfcAreaMeasure crossSectionArea) {
		this.crossSectionArea = crossSectionArea;
	}

	public IfcPositiveLengthMeasure getBarLength() {
		return this.barLength;
	}

	public void setBarLength(IfcPositiveLengthMeasure barLength) {
		this.barLength = barLength;
	}

	public IfcReinforcingBarTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcReinforcingBarTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return this.barSurface;
	}

	public void setBarSurface(IfcReinforcingBarSurfaceEnum barSurface) {
		this.barSurface = barSurface;
	}


}

