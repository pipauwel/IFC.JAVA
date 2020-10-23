// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("63d5034b-fa9c-4b85-bf43-9f24d48e41e5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRoofType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a roof element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1e67307a-a7f0-418c-9478-1e90ab9d50c9")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcRoofTypeEnum predefinedType;


	public IfcRoofType()
	{
	}

	public IfcRoofType(String globalId, IfcRoofTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcRoofTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRoofTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

