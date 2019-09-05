// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a8b69ebd-a055-4b49-b99d-0de94f4c7d81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFurnitureType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "AssemblyPlace")
	@Description("<p>A designation of where the assembly is intended to take place. A selection of alternatives s provided in an enumerated list.</p>")
	@Required()
	@Guid("791d2270-d762-4005-b5b8-19697f8a6878")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum assemblyPlace;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("b303f177-1e33-4bd3-a16d-fb06e46b54c0")
	private com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcFurnitureTypeEnum predefinedType;


	public IfcFurnitureType()
	{
	}

	public IfcFurnitureType(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum assemblyPlace)
	{
		super(globalId);
		this.assemblyPlace = assemblyPlace;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum getAssemblyPlace() {
		return this.assemblyPlace;
	}

	public void setAssemblyPlace(com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum assemblyPlace) {
		this.assemblyPlace = assemblyPlace;
	}

	public com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcFurnitureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcFurnitureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

