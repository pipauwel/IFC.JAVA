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

@Guid("7c307679-338b-48cf-92f2-d34c9d5f235c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPipeFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("The type of pipe fitting.")
	@DataMember(Order = 0)
	@Required()
	@Guid("2c44496c-2f0c-4ee8-9fd6-632c0dceca41")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcPipeFittingTypeEnum predefinedType;


	public IfcPipeFittingType()
	{
	}

	public IfcPipeFittingType(String globalId, IfcPipeFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcPipeFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPipeFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

