// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("cdb8d8f7-b0f6-4fc4-a97e-cc6ff85a83f6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitAssignment
{
	@Description("Units to be included within a unit assignment.")
	@Required()
	@MinLength(1)
	@Guid("41282efe-7993-4329-a53b-a25bface8606")
	private Set<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit> units = new HashSet<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit>();


	public IfcUnitAssignment()
	{
	}

	public IfcUnitAssignment(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit[] units)
	{
		this.units = new HashSet<>(Arrays.asList(units));
	}

	public Set<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit> getUnits() {
		return this.units;
	}


}

