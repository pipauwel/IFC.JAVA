// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cb200223-5993-48b1-9720-c4e9380a4074")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("The type of duct fitting.")
	@Required()
	@Guid("e24d6c2c-4c21-4500-89ea-01e996e56021")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFittingTypeEnum predefinedType;


	public IfcDuctFittingType()
	{
	}

	public IfcDuctFittingType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

