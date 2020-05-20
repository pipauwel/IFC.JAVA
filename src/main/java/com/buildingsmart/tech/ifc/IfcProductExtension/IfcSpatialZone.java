// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("238c3771-892d-42d9-95eb-0e1807d07f4c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSpatialZone extends IfcSpatialElement
{
	@Description("Predefined types to define the particular type of the spatial zone. There may be property set definitions available for each predefined type.")
	@DataMember(Order = 0)
	@Guid("2dfe36e4-06f5-40ff-bcfb-4976d2cfada4")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSpatialZoneTypeEnum predefinedType;


	public IfcSpatialZone()
	{
	}

	public IfcSpatialZone(String globalId)
	{
		super(globalId);
	}

	public IfcSpatialZoneTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSpatialZoneTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

