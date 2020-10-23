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

@Guid("cb200223-5993-48b1-9720-c4e9380a4074")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("The type of duct fitting.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e24d6c2c-4c21-4500-89ea-01e996e56021")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcDuctFittingTypeEnum predefinedType;


	public IfcDuctFittingType()
	{
	}

	public IfcDuctFittingType(String globalId, IfcDuctFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcDuctFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDuctFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

