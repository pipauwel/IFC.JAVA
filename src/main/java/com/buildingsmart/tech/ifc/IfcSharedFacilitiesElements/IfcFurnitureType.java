// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElementType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum;

@Guid("a8b69ebd-a055-4b49-b99d-0de94f4c7d81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFurnitureType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElementType
{
	@Description("<p>A designation of where the assembly is intended to take place. A selection of alternatives s provided in an enumerated list.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("791d2270-d762-4005-b5b8-19697f8a6878")
	@JacksonXmlProperty(isAttribute=true, localName = "AssemblyPlace")
	private IfcAssemblyPlaceEnum assemblyPlace;

	@DataMember(Order = 1)
	@Guid("b303f177-1e33-4bd3-a16d-fb06e46b54c0")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
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

