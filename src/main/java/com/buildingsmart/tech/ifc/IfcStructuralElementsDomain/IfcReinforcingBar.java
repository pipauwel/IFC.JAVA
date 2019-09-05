// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("32b47fe2-32c4-4ac2-8217-42fe8d2afda9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingBar extends IfcReinforcingElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "NominalDiameter")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingBarType</em> instead.</blockquote>")
	@Guid("260a1ee8-911e-47fc-8ccf-0980dc39e2f6")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "CrossSectionArea")
	@Description("The effective cross-section area of the reinforcing bar or group of bars.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional.</blockquote>")
	@Guid("f50fc626-ccf9-4b2a-b313-1352b0d7b6a7")
	private double crossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "BarLength")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingBarType</em> instead.</blockquote>")
	@Guid("0a8da1b1-a7c6-40d4-bc0c-9c921133a8ba")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure barLength;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("The role, purpose or usage of the bar, i.e. the kind of loads and stresses it is intended to carry.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute renamed from <em>BarRole</em> to <em>PredefinedType</em> and made optional.  Type changed from <em>IfcReinforcingBarRoleEnum</em> without changes to the range of enumeration items.</blockquote>")
	@Guid("777b8b8b-390b-48ec-b779-37083964afa6")
	private com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "BarSurface")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingBarType</em> instead.</blockquote>")
	@Guid("a9f1a5ea-5f63-40f2-b00d-c12c43572c1b")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum barSurface;


	public IfcReinforcingBar()
	{
	}

	public IfcReinforcingBar(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getNominalDiameter() {
		return this.nominalDiameter;
	}

	public void setNominalDiameter(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalDiameter) {
		this.nominalDiameter = nominalDiameter;
	}

	public double getCrossSectionArea() {
		return this.crossSectionArea;
	}

	public void setCrossSectionArea(double crossSectionArea) {
		this.crossSectionArea = crossSectionArea;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getBarLength() {
		return this.barLength;
	}

	public void setBarLength(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure barLength) {
		this.barLength = barLength;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum getBarSurface() {
		return this.barSurface;
	}

	public void setBarSurface(com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum barSurface) {
		this.barSurface = barSurface;
	}


}

