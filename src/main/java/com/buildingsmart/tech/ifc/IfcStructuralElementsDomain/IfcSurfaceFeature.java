// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e9ba48f9-734e-4e7f-9a90-572fd19c5475")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceFeature extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElement
{
	@Description("Indicates the kind of surface feature.")
	@DataMember(Order = 0)
	@Guid("324c2136-9ea8-40b8-b332-c28ff31d3c3a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSurfaceFeatureTypeEnum predefinedType;


	public IfcSurfaceFeature()
	{
	}

	public IfcSurfaceFeature(String globalId)
	{
		super(globalId);
	}

	public IfcSurfaceFeatureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSurfaceFeatureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

