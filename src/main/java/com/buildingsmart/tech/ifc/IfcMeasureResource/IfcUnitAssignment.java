// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("cdb8d8f7-b0f6-4fc4-a97e-cc6ff85a83f6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitAssignment
{
	@Description("Units to be included within a unit assignment.")
	@DataMember(Order = 0)
	@Required()
	@Guid("41282efe-7993-4329-a53b-a25bface8606")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcUnit")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "units")
	private Set<IfcUnit> units;


	public IfcUnitAssignment()
	{
	}

	public IfcUnitAssignment(IfcUnit[] units)
	{
		this.units = new HashSet<>(Arrays.asList(units));
	}

	public Set<IfcUnit> getUnits() {
		return this.units;
	}


}

