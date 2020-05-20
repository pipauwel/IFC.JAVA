// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a8b69ebd-a055-4b49-b99d-0de94f4c7d81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFurnitureType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElementType
{
	@Description("<p>A designation of where the assembly is intended to take place. A selection of alternatives s provided in an enumerated list.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("791d2270-d762-4005-b5b8-19697f8a6878")
	@JacksonXmlProperty(isAttribute=true, localName = "assemblyPlace")
	private IfcAssemblyPlaceEnum assemblyPlace;

	@DataMember(Order = 1)
	@Guid("b303f177-1e33-4bd3-a16d-fb06e46b54c0")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFurnitureTypeEnum predefinedType;


	public IfcFurnitureType()
	{
	}

	public IfcFurnitureType(String globalId, IfcAssemblyPlaceEnum assemblyPlace)
	{
		super(globalId);
		this.assemblyPlace = assemblyPlace;
	}

	public IfcAssemblyPlaceEnum getAssemblyPlace() {
		return this.assemblyPlace;
	}

	public void setAssemblyPlace(IfcAssemblyPlaceEnum assemblyPlace) {
		this.assemblyPlace = assemblyPlace;
	}

	public IfcFurnitureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFurnitureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

