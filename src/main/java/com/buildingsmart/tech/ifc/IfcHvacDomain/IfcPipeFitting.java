// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("51ec480e-81a5-4667-96a8-af2d91f8dc79")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPipeFitting extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting
{
	@DataMember(Order = 0)
	@Guid("9d3d9238-0a4a-4e50-88d6-e1577dfd7964")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcPipeFittingTypeEnum predefinedType;


	public IfcPipeFitting()
	{
	}

	public IfcPipeFitting(String globalId)
	{
		super(globalId);
	}

	public IfcPipeFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPipeFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

