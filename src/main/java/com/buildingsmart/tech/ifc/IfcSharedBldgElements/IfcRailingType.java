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

@Guid("9f5e37e7-709e-46f6-aa16-7ce984b35c92")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRailingType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a railing element from which the type required may be set.")
	@Required()
	@Guid("07835b3b-3d85-4552-97ee-27905ee63e86")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRailingTypeEnum predefinedType;


	public IfcRailingType()
	{
	}

	public IfcRailingType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRailingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRailingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRailingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

