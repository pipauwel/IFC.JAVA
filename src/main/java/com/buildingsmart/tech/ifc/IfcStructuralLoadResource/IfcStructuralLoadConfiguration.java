// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9918b5b5-eb80-483e-b901-d25ba01b4ae7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadConfiguration extends IfcStructuralLoad
{
	@Description("List of load or result values.")
	@Required()
	@MinLength(1)
	@Guid("65672309-32e2-4f35-8595-23022508fe7d")
	private List<com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult> values = new ArrayList<com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult>();

	@JacksonXmlProperty(isAttribute=false, localName = "Locations")
	@Description("Locations of the load samples or result samples, given within the local coordinate system defined by the instance which uses this resource object.  Each item in the list of locations pertains to the values list item at the same list index.  This attribute is optional for configurations in which the locations are implicitly known from higher-level definitions.")
	@MinLength(1)
	@Guid("d2c0264e-3df6-47e9-b75c-23ba83e2a29c")
	private List<Double> locations = new ArrayList<Double>();


	public IfcStructuralLoadConfiguration()
	{
	}

	public IfcStructuralLoadConfiguration(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult[] values)
	{
		this.values = new ArrayList<>(Arrays.asList(values));
	}

	public List<com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult> getValues() {
		return this.values;
	}

	public List<Double> getLocations() {
		return this.locations;
	}


}

