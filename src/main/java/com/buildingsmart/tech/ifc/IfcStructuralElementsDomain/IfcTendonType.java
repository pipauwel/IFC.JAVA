// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingElementType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonTypeEnum;

@Guid("66a6e642-3b24-4796-a6a3-8045c9ee3b54")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTendonType extends IfcReinforcingElementType
{
	@Description("Subtype of tendon.")
	@Required()
	@Guid("c3673c95-2686-4e5e-9e7a-0046b947ff94")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTendonTypeEnum predefinedType;

	@Description("The nominal diameter defining the cross-section size of the prestressed part of the tendon.")
	@Guid("e68ea63d-b611-4993-ac7c-486784151c1e")
	@JacksonXmlProperty(isAttribute=false, localName = "NominalDiameter")
	private IfcPositiveLengthMeasure nominalDiameter;

	@Description("The effective cross-section area of the prestressed part of the tendon.")
	@Guid("7cbdd29f-faaa-4ef5-92ff-d2b870e89f86")
	@JacksonXmlProperty(isAttribute=true, localName = "CrossSectionArea")
	private double crossSectionArea;

	@Description("Diameter of the sheeth (duct) around the tendon, if there is one with this type of tendon.")
	@Guid("558f7ecf-0e60-4557-abf4-3eb909d17bc2")
	@JacksonXmlProperty(isAttribute=false, localName = "SheathDiameter")
	private IfcPositiveLengthMeasure sheathDiameter;


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

	public IfcPositiveLengthMeasure getNominalDiameter() {
		return this.nominalDiameter;
	}

	public void setNominalDiameter(IfcPositiveLengthMeasure nominalDiameter) {
		this.nominalDiameter = nominalDiameter;
	}

	public double getCrossSectionArea() {
		return this.crossSectionArea;
	}

	public void setCrossSectionArea(double crossSectionArea) {
		this.crossSectionArea = crossSectionArea;
	}

	public IfcPositiveLengthMeasure getSheathDiameter() {
		return this.sheathDiameter;
	}

	public void setSheathDiameter(IfcPositiveLengthMeasure sheathDiameter) {
		this.sheathDiameter = sheathDiameter;
	}


}

