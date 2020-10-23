// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bc7e1649-6634-4653-947b-036b7b3af5bd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcValveType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("The type of valve.")
	@DataMember(Order = 0)
	@Required()
	@Guid("64e1374c-df50-4f51-8439-a60368207f3d")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcValveTypeEnum predefinedType;


	public IfcValveType()
	{
	}

	public IfcValveType(String globalId, IfcValveTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcValveTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcValveTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

