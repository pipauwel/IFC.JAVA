// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("67624ad3-5d2e-4f19-abe4-c8abfa34fd54")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFlowInstrument extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@DataMember(Order = 0)
	@Guid("5b774128-e349-4ff3-8ae3-28adab4523b1")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFlowInstrumentTypeEnum predefinedType;


	public IfcFlowInstrument()
	{
	}

	public IfcFlowInstrument(String globalId)
	{
		super(globalId);
	}

	public IfcFlowInstrumentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFlowInstrumentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

