// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c1d5b667-727a-4e33-a16c-cec44470ca27")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcementBarProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties
{
	@JacksonXmlProperty(isAttribute=true, localName = "TotalCrossSectionArea")
	@Description("The total effective cross-section area of the reinforcement of a specific steel grade.")
	@Required()
	@Guid("0a3287fa-94df-4a56-b7bb-d6299d19133a")
	private double totalCrossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "SteelGrade")
	@Description("The nominal steel grade defined according to local standards.")
	@Required()
	@Guid("7884f3a6-3453-4dbd-bc43-439ff97ce024")
	private String steelGrade;

	@JacksonXmlProperty(isAttribute=true, localName = "BarSurface")
	@Description("Indicator for whether the bar surface is plain or textured.")
	@Guid("0cc0ab54-3753-4179-bbe5-d207922e0809")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum barSurface;

	@JacksonXmlProperty(isAttribute=true, localName = "EffectiveDepth")
	@Description("The effective depth, i.e. the distance of the specific reinforcement cross section area or reinforcement configuration in a row, counted from a common specific reference point. Usually the reference point is the upper surface (for beams and slabs) or a similar projection in a plane (for columns).")
	@Guid("c05cd6da-13ef-40e0-aea8-e18e7b96e205")
	private double effectiveDepth;

	@JacksonXmlProperty(isAttribute=true, localName = "NominalBarDiameter")
	@Description("The nominal diameter defining the cross-section size of the reinforcing bar. The bar diameter should be identical for all bars included in the specific reinforcement configuration.")
	@Guid("9e618967-8206-4a64-bf1c-f065826620ac")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalBarDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "BarCount")
	@Description("The number of bars with identical nominal diameter and steel grade included in the specific reinforcement configuration.")
	@Guid("1d3f34e8-4a6a-4514-975b-b9e0649229e2")
	private int barCount;


	public IfcReinforcementBarProperties()
	{
	}

	public IfcReinforcementBarProperties(double totalCrossSectionArea, String steelGrade)
	{
		this.totalCrossSectionArea = totalCrossSectionArea;
		this.steelGrade = steelGrade;
	}

	public double getTotalCrossSectionArea() {
		return this.totalCrossSectionArea;
	}

	public void setTotalCrossSectionArea(double totalCrossSectionArea) {
		this.totalCrossSectionArea = totalCrossSectionArea;
	}

	public String getSteelGrade() {
		return this.steelGrade;
	}

	public void setSteelGrade(String steelGrade) {
		this.steelGrade = steelGrade;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum getBarSurface() {
		return this.barSurface;
	}

	public void setBarSurface(com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarSurfaceEnum barSurface) {
		this.barSurface = barSurface;
	}

	public double getEffectiveDepth() {
		return this.effectiveDepth;
	}

	public void setEffectiveDepth(double effectiveDepth) {
		this.effectiveDepth = effectiveDepth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getNominalBarDiameter() {
		return this.nominalBarDiameter;
	}

	public void setNominalBarDiameter(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalBarDiameter) {
		this.nominalBarDiameter = nominalBarDiameter;
	}

	public int getBarCount() {
		return this.barCount;
	}

	public void setBarCount(int barCount) {
		this.barCount = barCount;
	}


}

