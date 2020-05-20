// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("20c6cd7a-bb4c-42ed-8dca-1a4cfdf92797")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSpaceHeater extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@DataMember(Order = 0)
	@Guid("095307e6-1620-43fd-8170-a341f054d6b9")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSpaceHeaterTypeEnum predefinedType;


	public IfcSpaceHeater()
	{
	}

	public IfcSpaceHeater(String globalId)
	{
		super(globalId);
	}

	public IfcSpaceHeaterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSpaceHeaterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

