// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult;

@Guid("9918b5b5-eb80-483e-b901-d25ba01b4ae7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadConfiguration extends IfcStructuralLoad
{
	@Description("List of load or result values.")
	@DataMember(Order = 0)
	@Required()
	@Guid("65672309-32e2-4f35-8595-23022508fe7d")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStructuralLoadOrResult")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Values")
	private List<IfcStructuralLoadOrResult> values;

	@Description("Locations of the load samples or result samples, given within the local coordinate system defined by the instance which uses this resource object.  Each item in the list of locations pertains to the values list item at the same list index.  This attribute is optional for configurations in which the locations are implicitly known from higher-level definitions.")
	@DataMember(Order = 1)
	@Guid("d2c0264e-3df6-47e9-b75c-23ba83e2a29c")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Locations")
	private List<Double> locations;


	public IfcStructuralLoadConfiguration()
	{
	}

	public IfcStructuralLoadConfiguration(IfcStructuralLoadOrResult[] values)
	{
		this.values = new ArrayList<>(Arrays.asList(values));
	}

	public List<IfcStructuralLoadOrResult> getValues() {
		return this.values;
	}

	public List<Double> getLocations() {
		return this.locations;
	}


}

