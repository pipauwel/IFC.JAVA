// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("33cccfc5-2da4-42df-8cac-9c14b6d955a6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTendon extends IfcReinforcingElement
{
	@Description("Predefined generic types for a tendon.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional.</blockquote>")
	@DataMember(Order = 0)
	@Guid("8bf9e3ad-01c9-436e-a415-02119d9e681e")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTendonTypeEnum predefinedType;

	@Description("The nominal diameter defining the cross-section size of the tendon.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcTendonType</em> instead.</blockquote>")
	@DataMember(Order = 1)
	@Guid("769d5dcc-353b-448a-a5f9-3ff7b462d814")
	@JacksonXmlProperty(isAttribute=false, localName = "NominalDiameter")
	private double nominalDiameter; //IfcPositiveLengthMeasure

	@Description("The effective cross-section area of the tendon.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcTendonType</em> instead.</blockquote>")
	@DataMember(Order = 2)
	@Guid("f2710ff8-a1a9-46f2-bbc1-5b12b313be27")
	@JacksonXmlProperty(isAttribute=true, localName = "CrossSectionArea")
	private double crossSectionArea;

	@Description("The maximum allowed tension force that can be applied on the tendon.")
	@DataMember(Order = 3)
	@Guid("361cb1c1-156f-4fd7-b742-88f20ba76a5d")
	@JacksonXmlProperty(isAttribute=true, localName = "TensionForce")
	private double tensionForce;

	@Description("The prestress to be applied on the tendon.")
	@DataMember(Order = 4)
	@Guid("c7b0f979-558e-49ac-bf39-9fd037774d51")
	@JacksonXmlProperty(isAttribute=true, localName = "PreStress")
	private double preStress;

	@Description("The friction coefficient between tendon and tendon sheet while the tendon is unbonded.")
	@DataMember(Order = 5)
	@Guid("8b3dbb92-6ef8-4fa8-bce3-8fe156c01557")
	@JacksonXmlProperty(isAttribute=false, localName = "FrictionCoefficient")
	private double frictionCoefficient; //IfcNormalisedRatioMeasure

	@Description("The deformation of an anchor or slippage of tendons when the prestressing device is released.")
	@DataMember(Order = 6)
	@Guid("723e9da1-873b-41c5-8865-674d57ab2356")
	@JacksonXmlProperty(isAttribute=false, localName = "AnchorageSlip")
	private double anchorageSlip; //IfcPositiveLengthMeasure

	@Description("The smallest curvature radius calculated on the whole effective length of the tendon where the tension properties are still valid.")
	@DataMember(Order = 7)
	@Guid("b99f7bfe-1105-4b52-b367-038790040da0")
	@JacksonXmlProperty(isAttribute=false, localName = "MinCurvatureRadius")
	private double minCurvatureRadius; //IfcPositiveLengthMeasure


	public IfcTendon()
	{
	}

	public IfcTendon(String globalId)
	{
		super(globalId);
	}

	public IfcTendonTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTendonTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public double getNominalDiameter() {
		return this.nominalDiameter;
	}

	public void setNominalDiameter(double nominalDiameter) {
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

	public double getFrictionCoefficient() {
		return this.frictionCoefficient;
	}

	public void setFrictionCoefficient(double frictionCoefficient) {
		this.frictionCoefficient = frictionCoefficient;
	}

	public double getAnchorageSlip() {
		return this.anchorageSlip;
	}

	public void setAnchorageSlip(double anchorageSlip) {
		this.anchorageSlip = anchorageSlip;
	}

	public double getMinCurvatureRadius() {
		return this.minCurvatureRadius;
	}

	public void setMinCurvatureRadius(double minCurvatureRadius) {
		this.minCurvatureRadius = minCurvatureRadius;
	}


}

