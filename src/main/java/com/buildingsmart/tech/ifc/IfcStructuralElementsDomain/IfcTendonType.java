// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("66a6e642-3b24-4796-a6a3-8045c9ee3b54")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTendonType extends IfcReinforcingElementType
{
	@Description("Subtype of tendon.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c3673c95-2686-4e5e-9e7a-0046b947ff94")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTendonTypeEnum predefinedType;

	@Description("The nominal diameter defining the cross-section size of the prestressed part of the tendon.")
	@DataMember(Order = 1)
	@Guid("e68ea63d-b611-4993-ac7c-486784151c1e")
	@JacksonXmlProperty(isAttribute=false, localName = "NominalDiameter")
	private double nominalDiameter; //IfcPositiveLengthMeasure

	@Description("The effective cross-section area of the prestressed part of the tendon.")
	@DataMember(Order = 2)
	@Guid("7cbdd29f-faaa-4ef5-92ff-d2b870e89f86")
	@JacksonXmlProperty(isAttribute=true, localName = "CrossSectionArea")
	private double crossSectionArea;

	@Description("Diameter of the sheeth (duct) around the tendon, if there is one with this type of tendon.")
	@DataMember(Order = 3)
	@Guid("558f7ecf-0e60-4557-abf4-3eb909d17bc2")
	@JacksonXmlProperty(isAttribute=false, localName = "SheathDiameter")
	private double sheathDiameter; //IfcPositiveLengthMeasure


	public IfcTendonType()
	{
	}

	public IfcTendonType(String globalId, IfcTendonTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
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

	public double getSheathDiameter() {
		return this.sheathDiameter;
	}

	public void setSheathDiameter(double sheathDiameter) {
		this.sheathDiameter = sheathDiameter;
	}


}

