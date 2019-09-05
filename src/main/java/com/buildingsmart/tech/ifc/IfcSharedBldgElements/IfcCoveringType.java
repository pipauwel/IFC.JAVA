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

@Guid("2851a201-39c1-4a3e-a164-c288dc59b7b9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCoveringType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined types to define the particular type of the covering. There may be property set definitions available for each predefined type.")
	@Required()
	@Guid("b0342ac0-3b78-4cc1-84b6-89044b113089")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCoveringTypeEnum predefinedType;


	public IfcCoveringType()
	{
	}

	public IfcCoveringType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCoveringTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCoveringTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCoveringTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

