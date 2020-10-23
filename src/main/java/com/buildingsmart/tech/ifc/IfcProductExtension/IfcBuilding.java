// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPostalAddress;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("417b2868-1e1e-4b5e-b73a-84dec52d9767")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuilding extends IfcSpatialStructureElement
{
	@Description("Elevation above sea level of the reference height used for all storey elevation measures, equals to height 0.0. It is usually the ground floor level.")
	@DataMember(Order = 0)
	@Guid("b638bbf6-a449-4f87-b203-2bdd94b3c9fc")
	@JacksonXmlProperty(isAttribute=false, localName = "elevationOfRefHeight")
	private IfcLengthMeasure elevationOfRefHeight;

	@Description("Elevation above the minimal terrain level around the foot print of the building, given in elevation above sea level.")
	@DataMember(Order = 1)
	@Guid("19e45a59-8fc2-4694-be01-540ce797fd66")
	@JacksonXmlProperty(isAttribute=false, localName = "elevationOfTerrain")
	private IfcLengthMeasure elevationOfTerrain;

	@Description("Address given to the building for postal purposes.")
	@DataMember(Order = 2)
	@Guid("f8bb01a6-368c-4931-ab21-e811443bbfed")
	@JacksonXmlProperty(isAttribute=false, localName = "buildingAddress")
	private IfcPostalAddress buildingAddress;


	public IfcBuilding()
	{
	}

	public IfcBuilding(String globalId)
	{
		super(globalId);
	}

	public IfcLengthMeasure getElevationOfRefHeight() {
		return this.elevationOfRefHeight;
	}

	public void setElevationOfRefHeight(IfcLengthMeasure elevationOfRefHeight) {
		this.elevationOfRefHeight = elevationOfRefHeight;
	}

	public IfcLengthMeasure getElevationOfTerrain() {
		return this.elevationOfTerrain;
	}

	public void setElevationOfTerrain(IfcLengthMeasure elevationOfTerrain) {
		this.elevationOfTerrain = elevationOfTerrain;
	}

	public IfcPostalAddress getBuildingAddress() {
		return this.buildingAddress;
	}

	public void setBuildingAddress(IfcPostalAddress buildingAddress) {
		this.buildingAddress = buildingAddress;
	}


}

