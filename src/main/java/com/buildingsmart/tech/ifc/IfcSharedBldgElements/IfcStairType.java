// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d3b32e07-c9d3-4488-99fe-8ce356d2adc5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStairType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a stair element from which the type required may be set.")
	@Required()
	@Guid("b0b7e80d-1752-42ff-9551-397dbbab6cf2")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairTypeEnum predefinedType;


	public IfcStairType()
	{
	}

	public IfcStairType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

