// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcAreaMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("c46e7d75-e366-4cf2-839d-664d7f121513")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingBarType extends IfcReinforcingElementType
{
	@Description("Subtype of reinforcing bar.")
	@DataMember(Order = 0)
	@Required()
	@Guid("fca03e97-8ce9-4f5c-85ff-3dcf0977e521")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcReinforcingBarTypeEnum predefinedType;

	@Description("The nominal diameter defining the cross-section size of the reinforcing bar.")
	@DataMember(Order = 1)
	@Guid("fde37eb2-b137-41aa-aed4-6316a725c799")
	@JacksonXmlProperty(isAttribute=false, localName = "nominalDiameter")
	private IfcPositiveLengthMeasure nominalDiameter;

	@Description("The effective cross-section area of the reinforcing bar.")
	@DataMember(Order = 2)
	@Guid("a1374397-c2d5-4f1f-8287-b2798ba3bdc9")
	@JacksonXmlProperty(isAttribute=false, localName = "crossSectionArea")
	private IfcAreaMeasure crossSectionArea;

	@Description("The total length of the reinforcing bar. The total length of bended bars are calculated according to local standards with corrections for the bends.")
	@DataMember(Order = 3)
	@Guid("daef2cc9-4032-40d9-96be-0106c845b10a")
	@JacksonXmlProperty(isAttribute=false, localName = "barLength")
	private IfcPositiveLengthMeasure barLength;

	@Description("Indicator for whether the bar surface is plain or textured.")
	@DataMember(Order = 4)
	@Guid("523a6afb-4ec8-49fc-abf0-e285918fcb00")
	@JacksonXmlProperty(isAttribute=true, localName = "barSurface")
	private IfcReinforcingBarSurfaceEnum barSurface;

	@Description("Shape code per a standard like ACI 315, ISO 3766, or a similar standard.  It is presumed that a single standard for defining the bar bending is used throughout the project and that this standard is referenced from the <em>IfcProject</em> object through the <em>IfcDocumentReference</em> mechanism.")
	@DataMember(Order = 5)
	@Guid("0aba5d11-f542-4204-a111-a75ec36c13b0")
	@JacksonXmlProperty(isAttribute=false, localName = "bendingShapeCode")
	private IfcLabel bendingShapeCode;

	@Description("Bending shape parameters.  Their meaning is defined by the bending shape code and the respective standard.")
	@DataMember(Order = 6)
	@Guid("2c1e05e0-9fb3-4478-90b7-8119e40734f3")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcBendingParameterSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "bendingParameters")
	private List<IfcBendingParameterSelect> bendingParameters;


	public IfcReinforcingBarType()
	{
	}

	public IfcReinforcingBarType(String globalId, IfcReinforcingBarTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcReinforcingBarTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcReinforcingBarTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
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

	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return this.barSurface;
	}

	public void setBarSurface(IfcReinforcingBarSurfaceEnum barSurface) {
		this.barSurface = barSurface;
	}

	public IfcLabel getBendingShapeCode() {
		return this.bendingShapeCode;
	}

	public void setBendingShapeCode(IfcLabel bendingShapeCode) {
		this.bendingShapeCode = bendingShapeCode;
	}

	public List<IfcBendingParameterSelect> getBendingParameters() {
		return this.bendingParameters;
	}


}

