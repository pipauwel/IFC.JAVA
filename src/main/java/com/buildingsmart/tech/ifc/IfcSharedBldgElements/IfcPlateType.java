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

@Guid("67bc5143-2c23-49ee-9fc3-422c27dd5452")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPlateType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a planar member element from which the type required may be set.")
	@Required()
	@Guid("5f1eadb5-3430-43b0-b689-959f67eefef7")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcPlateTypeEnum predefinedType;


	public IfcPlateType()
	{
	}

	public IfcPlateType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcPlateTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcPlateTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcPlateTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

