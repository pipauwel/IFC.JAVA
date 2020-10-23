// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("03ba6f27-fdab-4d01-aebf-47861d1d3266")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcValve extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("23912a7a-28ed-4c3c-8007-e6bde9d3b5e1")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcValveTypeEnum predefinedType;


	public IfcValve()
	{
	}

	public IfcValve(String globalId)
	{
		super(globalId);
	}

	public IfcValveTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcValveTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

