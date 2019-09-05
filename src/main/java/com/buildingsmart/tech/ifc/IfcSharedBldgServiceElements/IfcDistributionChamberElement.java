// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0ed9ba24-3b80-425e-989f-171cef0fce7a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDistributionChamberElement extends IfcDistributionFlowElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("a495b02a-3151-4111-88a8-f27d4e85c9bf")
	private com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum predefinedType;


	public IfcDistributionChamberElement()
	{
	}

	public IfcDistributionChamberElement(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

