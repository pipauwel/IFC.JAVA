// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("33cccfc5-2da4-42df-8cac-9c14b6d955a6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTendon extends IfcReinforcingElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined generic types for a tendon.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional.</blockquote>")
	@Guid("8bf9e3ad-01c9-436e-a415-02119d9e681e")
	private com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "NominalDiameter")
	@Description("The nominal diameter defining the cross-section size of the tendon.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcTendonType</em> instead.</blockquote>")
	@Guid("769d5dcc-353b-448a-a5f9-3ff7b462d814")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "CrossSectionArea")
	@Description("The effective cross-section area of the tendon.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcTendonType</em> instead.</blockquote>")
	@Guid("f2710ff8-a1a9-46f2-bbc1-5b12b313be27")
	private double crossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "TensionForce")
	@Description("The maximum allowed tension force that can be applied on the tendon.")
	@Guid("361cb1c1-156f-4fd7-b742-88f20ba76a5d")
	private double tensionForce;

	@JacksonXmlProperty(isAttribute=true, localName = "PreStress")
	@Description("The prestress to be applied on the tendon.")
	@Guid("c7b0f979-558e-49ac-bf39-9fd037774d51")
	private double preStress;

	@JacksonXmlProperty(isAttribute=true, localName = "FrictionCoefficient")
	@Description("The friction coefficient between tendon and tendon sheet while the tendon is unbonded.")
	@Guid("8b3dbb92-6ef8-4fa8-bce3-8fe156c01557")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure frictionCoefficient;

	@JacksonXmlProperty(isAttribute=true, localName = "AnchorageSlip")
	@Description("The deformation of an anchor or slippage of tendons when the prestressing device is released.")
	@Guid("723e9da1-873b-41c5-8865-674d57ab2356")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure anchorageSlip;

	@JacksonXmlProperty(isAttribute=true, localName = "MinCurvatureRadius")
	@Description("The smallest curvature radius calculated on the whole effective length of the tendon where the tension properties are still valid.")
	@Guid("b99f7bfe-1105-4b52-b367-038790040da0")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure minCurvatureRadius;


	public IfcTendon()
	{
	}

	public IfcTendon(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonTypeEnum predefinedType) {
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

	public double getTensionForce() {
		return this.tensionForce;
	}

	public void setTensionForce(double tensionForce) {
		this.tensionForce = tensionForce;
	}

	public double getPreStress() {
		return this.preStress;
	}

	public void setPreStress(double preStress) {
		this.preStress = preStress;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getFrictionCoefficient() {
		return this.frictionCoefficient;
	}

	public void setFrictionCoefficient(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure frictionCoefficient) {
		this.frictionCoefficient = frictionCoefficient;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getAnchorageSlip() {
		return this.anchorageSlip;
	}

	public void setAnchorageSlip(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure anchorageSlip) {
		this.anchorageSlip = anchorageSlip;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getMinCurvatureRadius() {
		return this.minCurvatureRadius;
	}

	public void setMinCurvatureRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure minCurvatureRadius) {
		this.minCurvatureRadius = minCurvatureRadius;
	}


}

