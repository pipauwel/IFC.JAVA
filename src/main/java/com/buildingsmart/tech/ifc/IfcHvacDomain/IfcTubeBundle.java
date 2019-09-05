// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("082b5dfd-90c2-4db4-bd80-d6f63876cb70")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTubeBundle extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("722ea6a3-1d26-4b06-88d3-8b2fe2d5f40e")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum predefinedType;


	public IfcTubeBundle()
	{
	}

	public IfcTubeBundle(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

