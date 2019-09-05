// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c46e7d75-e366-4cf2-839d-664d7f121513")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingBarType extends IfcReinforcingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Subtype of reinforcing bar.")
	@Required()
	@Guid("fca03e97-8ce9-4f5c-85ff-3dcf0977e521")
	private com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "NominalDiameter")
	@Description("The nominal diameter defining the cross-section size of the reinforcing bar.")
	@Guid("fde37eb2-b137-41aa-aed4-6316a725c799")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "CrossSectionArea")
	@Description("The effective cross-section area of the reinforcing bar.")
	@Guid("a1374397-c2d5-4f1f-8287-b2798ba3bdc9")
	private double crossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "BarLength")
	@Description("The total length of the reinforcing bar. The total length of bended bars are calculated according to local standards with corrections for the bends.")
	@Guid("daef2cc9-4032-40d9-96be-0106c845b10a")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure barLength;

	@JacksonXmlProperty(isAttribute=true, localName = "BarSurface")
	@Description("Indicator for whether the bar surface is plain or textured.")
	@Guid("523a6afb-4ec8-49fc-abf0-e285918fcb00")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum barSurface;

	@JacksonXmlProperty(isAttribute=true, localName = "BendingShapeCode")
	@Description("Shape code per a standard like ACI 315, ISO 3766, or a similar standard.  It is presumed that a single standard for defining the bar bending is used throughout the project and that this standard is referenced from the <em>IfcProject</em> object through the <em>IfcDocumentReference</em> mechanism.")
	@Guid("0aba5d11-f542-4204-a111-a75ec36c13b0")
	private String bendingShapeCode;

	@Description("Bending shape parameters.  Their meaning is defined by the bending shape code and the respective standard.")
	@MinLength(1)
	@Guid("2c1e05e0-9fb3-4478-90b7-8119e40734f3")
	private List<com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcBendingParameterSelect> bendingParameters = new ArrayList<com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcBendingParameterSelect>();


	public IfcReinforcingBarType()
	{
	}

	public IfcReinforcingBarType(String globalId, com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
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

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum getBarSurface() {
		return this.barSurface;
	}

	public void setBarSurface(com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum barSurface) {
		this.barSurface = barSurface;
	}

	public String getBendingShapeCode() {
		return this.bendingShapeCode;
	}

	public void setBendingShapeCode(String bendingShapeCode) {
		this.bendingShapeCode = bendingShapeCode;
	}

	public List<com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcBendingParameterSelect> getBendingParameters() {
		return this.bendingParameters;
	}


}

